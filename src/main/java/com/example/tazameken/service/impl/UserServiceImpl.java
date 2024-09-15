package com.example.tazameken.service.impl;

import com.example.tazameken.dto.UserCreateDto;
import com.example.tazameken.dto.UserDto;
import com.example.tazameken.model.User;
import com.example.tazameken.repository.UserRepository;
import com.example.tazameken.service.UserAnswerService;
import com.example.tazameken.service.UserService;
import com.example.tazameken.util.AuthUtil;
import com.example.tazameken.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    private final UserAnswerService userAnswerService;
    private final FileUtil fileUtil;
    private final AuthUtil authUtil;

    @Override
    public User findByEmail(String username) {
        return userRepository.findByEmail(username).orElseThrow();
    }

    @Override
    public UserDto createUser(UserCreateDto userCreateDto) {
        User user = User.builder()
                .email(userCreateDto.getEmail())
                .enabled(true)
                .username(userCreateDto.getUsername())
                .password(encoder.encode(userCreateDto.getPassword()))
                .build();
        if(userCreateDto.getAvatar() == null) {
            user.setAvatar("default.jpg");
        } else {
             user.setAvatar(fileUtil.saveUploadedFile(userCreateDto.getAvatar(), "/images"));
        }

        return buildDto(userRepository.save(user));
    }

    @Override
    public UserDto getUser() {
        User user = authUtil.getUserByAuth();
        return buildDto(user);
    }

    private UserDto buildDto(User user) {
        return UserDto.builder()
                .username(user.getUsername())
                .point(userAnswerService.getPointsByUserId(user.getId()))
                .avatar(user.getAvatar())
                .build();
    }
}

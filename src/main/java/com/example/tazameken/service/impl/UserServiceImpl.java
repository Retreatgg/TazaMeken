package com.example.tazameken.service.impl;

import com.example.tazameken.dto.UserCreateDto;
import com.example.tazameken.dto.UserDto;
import com.example.tazameken.model.User;
import com.example.tazameken.repository.UserAnswerRepository;
import com.example.tazameken.repository.UserRepository;
import com.example.tazameken.service.UserService;
import com.example.tazameken.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    private final UserAnswerRepository userAnswerRepository;
    private final FileUtil fileUtil;

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
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        User user = findByEmail(email);
        return buildDto(user);
    }

    @Override
    public List<UserDto> getRating() {
        List<User> users = userRepository.findAll();
        return users.stream().map(this::buildDto)
                .sorted(Comparator.comparing(UserDto::getPoint).reversed())
                .toList();
    }

    private UserDto buildDto(User user) {
        return UserDto.builder()
                .username(user.getUsername())
                .point(userAnswerRepository.findPointByUserId(user.getId()))
                .avatar(user.getAvatar())
                .build();
    }
}

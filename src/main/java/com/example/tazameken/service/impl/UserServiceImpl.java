package com.example.tazameken.service.impl;

import com.example.tazameken.model.User;
import com.example.tazameken.repository.UserRepository;
import com.example.tazameken.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User findByEmail(String username) {
        return userRepository.findByEmail(username).orElseThrow();
    }
}

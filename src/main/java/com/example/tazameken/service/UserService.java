package com.example.tazameken.service;

import com.example.tazameken.dto.UserCreateDto;
import com.example.tazameken.dto.UserDto;
import com.example.tazameken.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByEmail(String username);
    UserDto createUser(UserCreateDto userCreateDto);
}

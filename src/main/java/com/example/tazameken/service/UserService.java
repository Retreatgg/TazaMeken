package com.example.tazameken.service;

import com.example.tazameken.dto.UserCreateDto;
import com.example.tazameken.dto.UserDto;
import com.example.tazameken.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User findByEmail(String username);
    UserDto createUser(UserCreateDto userCreateDto);
    UserDto getUser();
    List<UserDto> getRating();
}

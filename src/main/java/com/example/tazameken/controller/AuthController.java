package com.example.tazameken.controller;

import com.example.tazameken.dto.UserCreateDto;
import com.example.tazameken.dto.UserDto;
import com.example.tazameken.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    @PostMapping(value = "/register", consumes = {"multipart/form-data"})
    public ResponseEntity<UserDto> createUser(@ModelAttribute UserCreateDto userCreateDto) {
        return ResponseEntity.ok(userService.createUser(userCreateDto));
    }
}

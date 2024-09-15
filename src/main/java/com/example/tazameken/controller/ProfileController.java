package com.example.tazameken.controller;

import com.example.tazameken.dto.UserDto;
import com.example.tazameken.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/profile")
public class ProfileController {
    private final UserService userService;

    @GetMapping()
    public ResponseEntity<UserDto> myProfile() {
        return ResponseEntity.ok(userService.getUser());
    }
}

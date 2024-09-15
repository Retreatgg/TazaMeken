package com.example.tazameken.controller;

import com.example.tazameken.dto.UserDto;
import com.example.tazameken.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rating")
public class RatingController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getRating() {
        return ResponseEntity.ok(userService.getRating());
    }
}

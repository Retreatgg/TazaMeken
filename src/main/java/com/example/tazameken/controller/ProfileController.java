package com.example.tazameken.controller;

import com.example.tazameken.service.UserAnswerService;
import com.example.tazameken.util.AuthUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/profile")
public class ProfileController {
    private final UserAnswerService userAnswerService;
    private final AuthUtil authUtil;
    @GetMapping("points")
    public ResponseEntity<Integer> myPoints() {
        Long userId = authUtil.getUserByAuth().getId();
        return ResponseEntity.ok(userAnswerService.getPointsByUserId(userId));
    }
}

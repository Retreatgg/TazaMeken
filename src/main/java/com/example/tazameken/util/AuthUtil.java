package com.example.tazameken.util;

import com.example.tazameken.model.User;
import com.example.tazameken.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthUtil {
    private final UserService userService;
    public User getUserByAuth() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        System.out.println(email);
        return userService.findByEmail(email);
    }
}

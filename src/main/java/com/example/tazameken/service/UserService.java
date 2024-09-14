package com.example.tazameken.service;

import com.example.tazameken.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByEmail(String username);
}

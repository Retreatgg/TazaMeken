package com.example.tazameken.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class UserCreateDto {
    private String username;
    private String email;
    private String password;
    private MultipartFile avatar;
}

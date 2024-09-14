package com.example.tazameken.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface FileService {


    ResponseEntity<?> getImagesByPath(String imageName);
}

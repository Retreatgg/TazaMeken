package com.example.tazameken.controller;

import com.example.tazameken.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/files")
public class FileController {
    private final FileService fileService;
    @GetMapping("/{name}")
    public ResponseEntity<?> getFile(@PathVariable(name = "name") String imageName) {
        return fileService.getImagesByPath(imageName);
    }
}

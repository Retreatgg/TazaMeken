package com.example.tazameken.service.impl;

import com.example.tazameken.service.FileService;
import com.example.tazameken.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    private final FileUtil fileUtil;
    @Override
    public ResponseEntity<?> getImagesByPath(String imageName) {
        return fileUtil.getOutputFile("data/images/" + imageName);
    }
}

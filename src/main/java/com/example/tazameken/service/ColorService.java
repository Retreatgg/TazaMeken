package com.example.tazameken.service;

import com.example.tazameken.dto.ColorDto;
import org.springframework.stereotype.Service;

@Service
public interface ColorService {
    ColorDto findById(Long colorId);
}

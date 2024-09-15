package com.example.tazameken.service.impl;

import com.example.tazameken.dto.ColorDto;
import com.example.tazameken.model.Color;
import com.example.tazameken.repository.ColorRepository;
import com.example.tazameken.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {
    private final ColorRepository colorRepository;

    @Override
    public ColorDto findById(Long colorId) {
        Color color =  colorRepository.findById(colorId).orElseThrow();
        return buildDto(color);
    }

    private ColorDto buildDto(Color color) {
        return ColorDto.builder()
                .id(color.getId())
                .name(color.getName())
                .build();
    }
}

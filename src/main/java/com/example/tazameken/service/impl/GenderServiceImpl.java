package com.example.tazameken.service.impl;

import com.example.tazameken.dto.GenderDto;
import com.example.tazameken.model.Gender;
import com.example.tazameken.repository.GenderRepository;
import com.example.tazameken.service.GenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenderServiceImpl implements GenderService {
    private final GenderRepository genderRepository;

    @Override
    public GenderDto findById(Long genderId) {
        Gender gender = genderRepository.findById(genderId).orElseThrow();
        return buildDto(gender);
    }

    private GenderDto buildDto(Gender gender) {
        return GenderDto.builder()
                .id(gender.getId())
                .name(gender.getName())
                .build();
    }
}

package com.example.tazameken.service;

import com.example.tazameken.dto.GenderDto;
import org.springframework.stereotype.Service;

@Service
public interface GenderService {
    GenderDto findById(Long genderId);
}

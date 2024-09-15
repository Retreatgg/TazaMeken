package com.example.tazameken.service;

import com.example.tazameken.dto.ClotheDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClothesService {

    List<ClotheDto> getClothes(Long categoryId);
}

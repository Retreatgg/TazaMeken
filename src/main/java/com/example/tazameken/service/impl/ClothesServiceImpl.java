package com.example.tazameken.service.impl;

import com.example.tazameken.dto.ClotheDto;
import com.example.tazameken.model.Clothe;
import com.example.tazameken.repository.ClotheRepository;
import com.example.tazameken.service.CategoryService;
import com.example.tazameken.service.ClothesService;
import com.example.tazameken.service.ColorService;
import com.example.tazameken.service.GenderService;
import com.example.tazameken.specification.ClotheSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClothesServiceImpl implements ClothesService {
    private final ClotheRepository clotheRepository;
    private final CategoryService categoryService;
    private final ColorService colorService;
    private final GenderService genderService;


    @Override
    public List<ClotheDto> getClothes(Long categoryId) {
        Specification<Clothe> spec = ClotheSpecification.hasCategory(categoryId);
        List<Clothe> clothes = clotheRepository.findAll(spec);
        return clothes.stream().map(this::buildDto).toList();
    }

    private ClotheDto buildDto(Clothe clothe) {
        return ClotheDto.builder()
                .gender(genderService.findById(clothe.getGender().getId()))
                .size(clothe.getSize())
                .price(clothe.getPrice())
                .id(clothe.getId())
                .photoName(clothe.getPhotoName())
                .category(categoryService.findById(clothe.getCategory().getId()))
                .color(colorService.findById(clothe.getColor().getId()))
                .build();
    }
}

package com.example.tazameken.service.impl;

import com.example.tazameken.dto.CategoryDto;
import com.example.tazameken.model.Category;
import com.example.tazameken.repository.CategoryRepository;
import com.example.tazameken.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryDto findById(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow();
        return buildDto(category);
    }

    private CategoryDto buildDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}

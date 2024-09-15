package com.example.tazameken.service.impl;

import com.example.tazameken.dto.CategoryDto;
import com.example.tazameken.model.Category;
import com.example.tazameken.model.Clothe;
import com.example.tazameken.repository.CategoryRepository;
import com.example.tazameken.service.CategoryService;
import com.example.tazameken.specification.ClotheSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryDto findById(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow();
        return buildDto(category);
    }

    @Override
    public List<CategoryDto> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(this::buildDto).toList();
    }

    private CategoryDto buildDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}

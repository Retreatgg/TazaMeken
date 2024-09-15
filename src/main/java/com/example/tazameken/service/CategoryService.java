package com.example.tazameken.service;

import com.example.tazameken.dto.CategoryDto;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    CategoryDto findById(Long categoryId);
}

package com.example.tazameken.service;

import com.example.tazameken.dto.ArticleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {
    List<ArticleDto> findAll();
    ArticleDto findById(Long id);
}

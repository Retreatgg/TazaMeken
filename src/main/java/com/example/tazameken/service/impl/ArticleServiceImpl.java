package com.example.tazameken.service.impl;

import com.example.tazameken.dto.ArticleDto;
import com.example.tazameken.model.Article;
import com.example.tazameken.repository.ArticleRepository;
import com.example.tazameken.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    @Override
    public List<ArticleDto> findAll() {
        List<Article> articles = articleRepository.findAll();
        return articles.stream().map(this::buildDto).toList();
    }

    @Override
    public ArticleDto findById(Long id) {
        return buildDto(articleRepository.findById(id).orElseThrow());
    }

    private ArticleDto buildDto(Article article) {
        return ArticleDto.builder()
                .id(article.getId())
                .title(article.getTitle())
                .description(article.getDescription())
                .build();
    }
}

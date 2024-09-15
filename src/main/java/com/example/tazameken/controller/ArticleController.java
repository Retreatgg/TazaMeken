package com.example.tazameken.controller;

import com.example.tazameken.dto.ArticleDto;
import com.example.tazameken.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/articles")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public ResponseEntity<List<ArticleDto>> getArticles() {
        return ResponseEntity.ok(articleService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<ArticleDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(articleService.findById(id));
    }
}

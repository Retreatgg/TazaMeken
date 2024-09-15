package com.example.tazameken.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {
    private Long id;
    private String title;
    private String description;
}

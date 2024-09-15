package com.example.tazameken.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserAnswerCreateDto implements Serializable {
    private Long questionId;
    private Long answerId;
}

package com.example.tazameken.dto;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.tazameken.model.SurveyAnswer}
 */
@Value
@Data
@Builder
public class SurveyAnswerDto implements Serializable {
    Long id;
    @Size(max = 255)
    String answerText;
    Boolean isCorrect;
}
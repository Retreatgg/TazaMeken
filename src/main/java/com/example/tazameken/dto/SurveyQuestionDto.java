package com.example.tazameken.dto;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.example.tazameken.model.SurveyQuestion}
 */
@Value
@Data
@Builder
public class SurveyQuestionDto implements Serializable {
    Long id;
    @Size(max = 255)
    String questionText;
    List<SurveyAnswerDto> answerDtoList;
}
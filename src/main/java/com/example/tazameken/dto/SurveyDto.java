package com.example.tazameken.dto;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * DTO for {@link com.example.tazameken.model.Survey}
 */
@Data
@Builder
public class SurveyDto implements Serializable {
    Long id;
    @Size(max = 255)
    String title;
    String description;
    List<SurveyQuestionDto> questionDtoList;
}
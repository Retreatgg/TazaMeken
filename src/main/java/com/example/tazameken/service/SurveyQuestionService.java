package com.example.tazameken.service;

import com.example.tazameken.dto.SurveyQuestionDto;
import org.springframework.stereotype.Service;

@Service
public interface SurveyQuestionService {
    SurveyQuestionDto findById(Long surveyQuestionId);
}

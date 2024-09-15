package com.example.tazameken.service;

import com.example.tazameken.dto.SurveyAnswerDto;
import org.springframework.stereotype.Service;

@Service
public interface SurveyAnswerService {
    SurveyAnswerDto findById(Long surveyAnswerId);
}

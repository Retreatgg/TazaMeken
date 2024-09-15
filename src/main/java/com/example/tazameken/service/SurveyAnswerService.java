package com.example.tazameken.service;

import com.example.tazameken.dto.SurveyAnswerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SurveyAnswerService {
    SurveyAnswerDto findById(Long surveyAnswerId);
}

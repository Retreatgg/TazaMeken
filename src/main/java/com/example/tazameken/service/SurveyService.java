package com.example.tazameken.service;

import com.example.tazameken.dto.SurveyDto;
import org.springframework.stereotype.Service;

@Service
public interface SurveyService {

    SurveyDto findSurveyById(Long surveyId);
}

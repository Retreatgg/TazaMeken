package com.example.tazameken.service.impl;

import com.example.tazameken.dto.SurveyDto;
import com.example.tazameken.model.Survey;
import com.example.tazameken.repository.SurveyRepository;
import com.example.tazameken.service.SurveyQuestionService;
import com.example.tazameken.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SurveyServiceImpl implements SurveyService {
    private final SurveyRepository surveyRepository;
    private final SurveyQuestionService surveyQuestionService;

    @Override
    public SurveyDto findSurveyById(Long surveyId) {
        Survey survey = surveyRepository.findById(surveyId).orElseThrow();
        return buildDto(survey);
    }

    private SurveyDto buildDto(Survey survey) {
        return SurveyDto.builder()
                .id(survey.getId())
                .title(survey.getTitle())
                .description(survey.getDescription())
                .questionDtoList(survey.getSurveyQuestions()
                        .stream()
                        .map(s -> surveyQuestionService.findById(s.getId())).toList())
                .build();
    }
}

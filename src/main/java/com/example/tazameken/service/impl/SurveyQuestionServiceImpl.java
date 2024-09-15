package com.example.tazameken.service.impl;

import com.example.tazameken.dto.SurveyQuestionDto;
import com.example.tazameken.model.SurveyQuestion;
import com.example.tazameken.repository.SurveyQuestionRepository;
import com.example.tazameken.service.SurveyAnswerService;
import com.example.tazameken.service.SurveyQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyQuestionServiceImpl implements SurveyQuestionService {
    private final SurveyQuestionRepository surveyQuestionRepository;
    private final SurveyAnswerService surveyAnswerService;


    @Override
    public SurveyQuestionDto findById(Long surveyQuestionId) {
        SurveyQuestion surveyQuestion = surveyQuestionRepository.findById(surveyQuestionId).orElseThrow();
        return buildDto(surveyQuestion);
    }

    private SurveyQuestionDto buildDto(SurveyQuestion surveyQuestion) {
        return SurveyQuestionDto.builder()
                .id(surveyQuestion.getId())
                .questionText(surveyQuestion.getQuestionText())
                .answerDtoList(surveyQuestion.getSurveyAnswers()
                        .stream().map(s -> surveyAnswerService.findById(s.getId())).toList())
                .build();
    }
}

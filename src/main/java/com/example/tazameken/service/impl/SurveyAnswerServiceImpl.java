package com.example.tazameken.service.impl;

import com.example.tazameken.dto.SurveyAnswerDto;
import com.example.tazameken.model.SurveyAnswer;
import com.example.tazameken.repository.SurveyAnswerRepository;
import com.example.tazameken.service.SurveyAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyAnswerServiceImpl implements SurveyAnswerService {
    private final SurveyAnswerRepository surveyAnswerRepository;

    @Override
    public SurveyAnswerDto findById(Long surveyAnswerId) {
        SurveyAnswer surveyAnswer = surveyAnswerRepository.findById(surveyAnswerId).orElseThrow();
        return buildDto(surveyAnswer);
    }

    private SurveyAnswerDto buildDto(SurveyAnswer surveyAnswer) {
        return SurveyAnswerDto.builder()
                .answerText(surveyAnswer.getAnswerText())
                .isCorrect(surveyAnswer.getIsCorrect())
                .id(surveyAnswer.getId())
                .build();
    }
}

package com.example.tazameken.service;

import com.example.tazameken.dto.UserAnswerCreateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserAnswerService {
    void save(Long surveyId, List<UserAnswerCreateDto> userAnswerCreateDtoList);
    Integer getPointsByUserId(Long userId);
}

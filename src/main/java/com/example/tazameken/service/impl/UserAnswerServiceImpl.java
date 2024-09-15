package com.example.tazameken.service.impl;

import com.example.tazameken.dto.UserAnswerCreateDto;
import com.example.tazameken.model.UserAnswer;
import com.example.tazameken.repository.SurveyAnswerRepository;
import com.example.tazameken.repository.UserAnswerRepository;
import com.example.tazameken.service.UserAnswerService;
import com.example.tazameken.util.AuthUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserAnswerServiceImpl implements UserAnswerService {
    private final UserAnswerRepository userAnswerRepository;
    private final SurveyAnswerRepository surveyAnswerRepository;
    private final AuthUtil authUtil;
    @Override
    public void save(Long surveyId, List<UserAnswerCreateDto> userAnswerCreateDtoList) {
        userAnswerCreateDtoList.forEach(uac -> userAnswerRepository.save(buildModel(uac)));
    }

    @Override
    public Integer getPointsByUserId(Long userId) {
        return userAnswerRepository.findPointByUserId(userId);
    }

    private UserAnswer buildModel(UserAnswerCreateDto userAnswerCreateDto) {
        return UserAnswer.builder()
                .answeredDate(Instant.now())
                .user(authUtil.getUserByAuth())
                .answer(surveyAnswerRepository.findById(userAnswerCreateDto.getAnswerId()).orElseThrow())
                .build();
    }
}

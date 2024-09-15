package com.example.tazameken.controller;


import com.example.tazameken.dto.UserAnswerCreateDto;
import com.example.tazameken.service.UserAnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys/{surveyId}/answers")
@RequiredArgsConstructor
public class SurveyAnswerController {
    private final UserAnswerService userAnswerService;
    @PostMapping()
    public HttpStatus saveAnswer(@PathVariable Long surveyId, @RequestBody List<UserAnswerCreateDto> userAnswerCreateDtoList) {
        userAnswerService.save(surveyId, userAnswerCreateDtoList);
        return HttpStatus.OK;
    }
}

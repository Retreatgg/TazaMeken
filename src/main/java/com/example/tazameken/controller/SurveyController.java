package com.example.tazameken.controller;

import com.example.tazameken.dto.SurveyDto;
import com.example.tazameken.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/surveys")
public class SurveyController {
    public final SurveyService surveyService;

    @GetMapping("{id}")
    public ResponseEntity<SurveyDto> getSurvey(@PathVariable Long id) {
        return ResponseEntity.ok(surveyService.findSurveyById(id));
    }
}

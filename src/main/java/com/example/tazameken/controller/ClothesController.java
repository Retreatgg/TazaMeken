package com.example.tazameken.controller;

import com.example.tazameken.dto.ClotheDto;
import com.example.tazameken.service.ClothesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/clothes")
@RequiredArgsConstructor
public class ClothesController {

    private final ClothesService clothesService;

    @GetMapping()
    public ResponseEntity<List<ClotheDto>> getClothes(@RequestParam(name = "category", defaultValue = "0") Long categoryId) {
        return ResponseEntity.ok(clothesService.getClothes(categoryId));
    }
}

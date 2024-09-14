package com.example.tazameken.controller;

import com.example.tazameken.dto.BidCreateDto;
import com.example.tazameken.dto.BidDto;
import com.example.tazameken.service.BidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bids")
public class BidController {
    private final BidService bidService;

    @PostMapping(consumes = {"multipart/form-data"})
    public ResponseEntity<BidDto> createBid(@ModelAttribute BidCreateDto createDto) {
        return ResponseEntity.ok(bidService.createBid(createDto));
    }
}

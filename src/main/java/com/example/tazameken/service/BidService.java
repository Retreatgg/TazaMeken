package com.example.tazameken.service;

import com.example.tazameken.dto.BidCreateDto;
import com.example.tazameken.dto.BidDto;
import org.springframework.stereotype.Service;

@Service
public interface BidService {
    BidDto createBid(BidCreateDto bidCreateDto);
}

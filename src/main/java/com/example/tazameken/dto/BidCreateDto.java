package com.example.tazameken.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class BidCreateDto {
    private Double latitude;
    private Double longitude;
    private Double altitude;
    private MultipartFile photo;
}

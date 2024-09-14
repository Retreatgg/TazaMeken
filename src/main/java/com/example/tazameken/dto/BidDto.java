package com.example.tazameken.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Data
public class BidDto {
    private Double latitude;
    private Double longitude;
    private String photo;
}

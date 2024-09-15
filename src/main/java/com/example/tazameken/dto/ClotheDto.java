package com.example.tazameken.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClotheDto {
    private Long id;
    private CategoryDto category;
    private ColorDto color;
    private GenderDto gender;
    private String size;
    private Long price;
    private String photoName;
}

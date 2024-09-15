package com.example.tazameken.dto;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

@Value
@Builder
@Data
public class ColorDto implements Serializable {
    Long id;
    @Size(max = 255)
    String name;
}
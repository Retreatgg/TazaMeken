package com.example.tazameken.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenIpi() {
        return new OpenAPI().info(
                new Info().title("TazaMeken").version("1.0.0")
        );
    }
}

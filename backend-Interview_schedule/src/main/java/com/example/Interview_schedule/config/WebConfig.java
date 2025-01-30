package com.example.Interview_schedule.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // This allows CORS for the /api/** endpoints
        registry.addMapping("/api/**")
                .allowedOrigins("http://192.168.29.67")  // Allow frontend's IP address
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);  // Allow credentials like cookies
    }
}

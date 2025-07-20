package com.example.fitsandgiggles.project.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public String exampleBean() {
        System.out.println("Testing functionality");
        return "This is an example bean";
    }
}

package com.springboot.project.springboot.project.config;

import com.springboot.project.springboot.project.common.Coach;
import com.springboot.project.springboot.project.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {


    @Bean
    public Coach swimCoach() {
             return new SwimCoach();
    }
}

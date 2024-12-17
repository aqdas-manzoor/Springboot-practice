package com.springboot.project.springboot.project.common;

import jdk.jfr.Category;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

    public GymCoach() {
        System.out.println("GymCoach" + getClass().getSimpleName());
    }

    /**
     * @return
     */
    @Override
    public String getTraining() {
        return "Practice for Exercise";
    }
}

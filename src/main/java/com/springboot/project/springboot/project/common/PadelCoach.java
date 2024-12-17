package com.springboot.project.springboot.project.common;

import org.springframework.stereotype.Component;

@Component
public class PadelCoach implements Coach {
    public PadelCoach() {
        System.out.println("PadelCoach" + getClass().getSimpleName());
    }

    /**
     * @return
     */
    @Override
    public String getTraining() {
        return "Practice for Padel Coach";
    }
}

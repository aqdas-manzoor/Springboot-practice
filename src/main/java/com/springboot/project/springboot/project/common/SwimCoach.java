package com.springboot.project.springboot.project.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("SwimCoach" + getClass().getSimpleName());
    }

    @Override
    public String getTraining() {
        return "Swim Coach";
    }
}

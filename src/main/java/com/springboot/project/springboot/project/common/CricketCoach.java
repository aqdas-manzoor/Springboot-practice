package com.springboot.project.springboot.project.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Component: mark the class as a spring bean
 */
@Component
//: make it default choice for injection when we have multiple beans of same type
//@Primary
//it is created only when it is needed
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach" + getClass().getSimpleName());
    }

    @Override
    public String getTraining() {

        return "Practice for Cricket Coach";
    }

    // define our init method
//    @PostConstruct
//    public void doStartUpStuff(){
//       System.out.println("doStartUpStuff"+ getClass().getSimpleName());
//    }

    // define our destroy method
//    @PreDestroy
//    public void doCleanUpStuff(){
//        System.out.println("doCleanUpStuff"+ getClass().getSimpleName());
//    }
}

package com.springboot.project.springboot.project.rest;

import com.springboot.project.springboot.project.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    // create the private fields for dependency
    private Coach coach;
    private Coach myCoach;

    /**
     * Constructor injection: because it required dependency
     * //     * @param coach
     */
    @Autowired
    public DemoRestController(@Qualifier("swimCoach") Coach coach) {
        this.coach = coach;
    }
    // check the prototype feature
//    @Autowired
//    public DemoRestController(@Qualifier("cricketCoach") Coach coach,
//                              @Qualifier("cricketCoach") Coach myCoach) {
//        System.out.println("Inside DemoRestController" + getClass().getSimpleName());
//        this.coach = coach;
//        this.myCoach = myCoach;
//    }

    // added to check the bean scope
//    @GetMapping("/checkcoach")
//    public  String checkCoach() {
//       return ("compare bean" + " " +(coach==myCoach));
//    }

    /**
     * Setter Injection
     * //     * @param coach
     */
//    @Autowired
//    public void setCoach(Coach coach) {
//        this.coach=coach;
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getTraining();
    }

    //inject properties
    @Value("${first.name}")
    private String firstName;
    @Value("${last.name}")
    private String lastName;

    @GetMapping("/fullName")
    public String fullName() {
        return firstName + " " + lastName;
    }

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/sayBye")
    public String sayBye() {
        return "Bye World";
    }

    @GetMapping("/sayByee")
    public String sayByee() {
        return "Bye Worlddd!!";
    }

}

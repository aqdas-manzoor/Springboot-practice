package com.springboot.project.springboot.project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

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

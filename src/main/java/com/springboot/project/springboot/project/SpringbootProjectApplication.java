package com.springboot.project.springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectApplication {

	public static void main(String[] args) {
		/**
		 * it create the servelet container and host the application
		 */
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

}

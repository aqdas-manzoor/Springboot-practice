package com.springboot.project.springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* By default componentscaning only scan package and their subpackage and util is not subpackage
  so we need to mention the util package in the @SpringBootApplication annotation
 * @SpringBootApplication (scanBasePackages={"com.springboot.project.springboot.project","com.util"})
 */
@SpringBootApplication
public class SpringbootProjectApplication {

    public static void main(String[] args) {
        /**
         * it create the servelet container and host the application
         */
        SpringApplication.run(SpringbootProjectApplication.class, args);
    }

}

package com.example.meme;

import Controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = StudentController.class)
public class MemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemeApplication.class, args);
    }

}

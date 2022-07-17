package com.example.fullapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
public class FullApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullApplication.class, args);
    }

}

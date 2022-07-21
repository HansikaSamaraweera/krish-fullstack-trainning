package com.example.rentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EntityScan(basePackages = "lk.codelabs.rentcloud.model.rent")
@EnableCircuitBreaker
public class RentserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentserviceApplication.class, args);
    }

}

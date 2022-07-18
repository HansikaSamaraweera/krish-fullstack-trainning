package com.example.vehicleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurecaClient
public class VehicleserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleserviceApplication.class, args);
    }

}

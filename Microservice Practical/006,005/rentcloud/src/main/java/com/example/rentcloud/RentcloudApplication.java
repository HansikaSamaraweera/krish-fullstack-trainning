package com.example.rentcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RentcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentcloudApplication.class, args);
    }

}

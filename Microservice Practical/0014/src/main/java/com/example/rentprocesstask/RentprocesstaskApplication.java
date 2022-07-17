package com.example.rentprocesstask;

import com.example.rentprocesstask.service.RentProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class RentprocesstaskApplication {

    @Bean
    RentProcessTaskRunner getRentPorcessTaskRunner(){
        return new RentProcessTaskRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(RentprocesstaskApplication.class, args);
    }

}

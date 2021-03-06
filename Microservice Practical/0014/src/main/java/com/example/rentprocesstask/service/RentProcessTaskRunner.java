package com.example.rentprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class RentProcessTaskRunner implements CommandLineRunner {

    @Autowired
    RentProcessService rentProcessService;

    @Override
    public void run(String... args) throws Exception {

        if (args.length>0){
            System.out.println("task run with argument");

            if (rentProcessService.validateDL(args[0])){
                System.out.println("valid diving license");
            }else{
                System.out.println("invalid diving license");
            }
        }else {
            System.out.println("task run without argument");

        }
    }
}

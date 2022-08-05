package com.example.demo.controller;


import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC = "fuel";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Object order)
    {
        // Sending the message
        kafkaTemplate.send(TOPIC, order);

        return "Published Successfully";
    }

    @PostMapping(value = "/add")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }


}

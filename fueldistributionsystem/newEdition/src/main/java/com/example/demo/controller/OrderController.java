package com.example.demo.controller;


import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin()
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

    @GetMapping(value = "/search/{OrderId}")
    public Optional<Order> searchByOrderId(@PathVariable String orderId){
        System.out.println(orderId);
        return orderService.getByOrderId(orderId);
    }
    @GetMapping("/getall")
    public Iterable<Order> getAllOrders(){

        return orderService.findAll();
    }




}

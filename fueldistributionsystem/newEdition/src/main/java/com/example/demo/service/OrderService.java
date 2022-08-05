package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
   public OrderRepository orderRepository;
    List<Order> listorder  = new ArrayList<>();

    @KafkaListener(topics = "fuel", groupId = "orderid", containerFactory = "studentListner")
    public void publish(List<Order> order){
        System.out.println("new Entry:"+order);

    }
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }
}

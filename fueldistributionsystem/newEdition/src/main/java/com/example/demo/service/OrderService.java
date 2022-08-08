package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
   public OrderRepository orderRepository;

    @KafkaListener(topics = "fuel", groupId = "orderid", containerFactory = "studentListner")
    public void publish(List<Order> order){
        System.out.println("new Entry:"+order);

    }
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> getByOrderId(String orderId){
        return orderRepository.getByOrderId(orderId);
    }

    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }


}

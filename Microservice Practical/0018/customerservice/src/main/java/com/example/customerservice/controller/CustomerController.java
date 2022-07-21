package com.example.customerservice.controller;

import com.example.customerservice.service.CustomerService;
import customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("services/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable int id) {

        System.out.println("request came on "+ LocalDateTime.now() + " 2 ++++++++++++++++++++++");
        return customerService.findById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

}

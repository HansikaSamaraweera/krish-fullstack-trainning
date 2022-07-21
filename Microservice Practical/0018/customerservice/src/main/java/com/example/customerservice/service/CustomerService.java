package com.example.customerservice.service;

import com.example.customerservice.repository.CustomerRepository;
import customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }


    public Customer findById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isPresent())
            return customer.get();
        else
            return new Customer();

    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

package com.example.rentservice.controller;

import com.example.rentservice.model.Responce;
import com.example.rentservice.model.DetailResponse;
import com.example.rentservice.model.SimpleResponse;
import com.example.rentservice.service.Rentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rent.Rent;

import java.util.List;
@RestController
@RequestMapping("/services/rents")
public class RentController {
    @Autowired
    Rentservice rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Responce getRent(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return  new SimpleResponse(rentService.findById(id));
        }else{
            return rentService.findDetailResponse(id);
        }

    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }

}

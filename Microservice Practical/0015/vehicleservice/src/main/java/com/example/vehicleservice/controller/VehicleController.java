package com.example.vehicleservice.controller;

import com.example.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("services/vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @GetMapping(value = "/{id}")
    public Vehicle getVehicle(@PathVariable int id)
    {
        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return vehicleService.findById(id);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.findAll();
    }

}

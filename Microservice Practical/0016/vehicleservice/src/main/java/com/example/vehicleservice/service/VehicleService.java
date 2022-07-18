package com.example.vehicleservice.service;

import com.example.vehicleservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vehicle.Vehicle;

import java.util.List;
import java.util.Optional;
@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;


    public Vehicle save(Vehicle customer) {

        return vehicleRepository.save(customer);
    }

    public Vehicle findById(int id) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);

        if (vehicle.isPresent())
            return vehicle.get();
        else
            return new Vehicle();

    }

    public List<Vehicle> findAll() {

        return vehicleRepository.findAll();
    }


}

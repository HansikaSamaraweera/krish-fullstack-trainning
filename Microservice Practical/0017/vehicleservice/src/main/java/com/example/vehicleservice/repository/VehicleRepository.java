package com.example.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicle.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {


}

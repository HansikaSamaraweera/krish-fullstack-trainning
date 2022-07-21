package com.example.rentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rent.Rent;

public interface RentRepository extends JpaRepository<Rent,Integer> {
}

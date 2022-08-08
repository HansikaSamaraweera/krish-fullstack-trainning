package com.example.demo.repository;

import com.example.demo.model.Station;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends MongoRepository<Station,String> {
    Iterable<Station> getByIdAndPassword(String id, String password);
}

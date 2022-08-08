package com.example.demo.service;

import com.example.demo.model.Station;
import com.example.demo.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StationService {

    @Autowired
    public StationRepository stationRepository;


    public Station saveStation(Station station) {
        return stationRepository.save(station);
    }

    public Optional<Station> getByIdAndPassword(String id) {
        return stationRepository.findById(id);
    }
}

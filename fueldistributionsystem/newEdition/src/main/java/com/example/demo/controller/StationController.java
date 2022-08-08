package com.example.demo.controller;

import com.example.demo.model.Station;
import com.example.demo.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/station")
public class StationController {

    @Autowired
   public StationService stationService;

   @PostMapping(value = "/add")
   public Station saveStation(@RequestBody Station station){
      return stationService.saveStation(station);
   }

   @GetMapping(value = "/login/{id}")
   public Optional<Station> getByIdAndPassword(@PathVariable String id){
      return stationService.getByIdAndPassword(id);
   }



}


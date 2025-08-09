package com.example.bookMyShow.controller;

import com.example.bookMyShow.model.Seat;
import com.example.bookMyShow.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/booking")
public class SeatController {
    @Autowired
    private SeatRepository seatRepository;
    @GetMapping("/show/{showId}")
    public ResponseEntity<List<Seat>> getSeatsForShow(@PathVariable String showId) {
        return ResponseEntity.ok(seatRepository.findAll()); // where is showId getting used?
    }
}

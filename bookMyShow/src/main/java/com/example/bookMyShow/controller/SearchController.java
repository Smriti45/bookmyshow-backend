package com.example.bookMyShow.controller;

import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.model.Seat;
import com.example.bookMyShow.repository.SeatRepository;
import com.example.bookMyShow.service.MovieSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class SearchController {
    // get movie on basis of city, date, theatre
    @Autowired private MovieSearchService movieSearchService;
    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> search(@RequestParam String city, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(movieSearchService.search(city, date));
    }
}

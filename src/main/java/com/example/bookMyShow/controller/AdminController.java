package com.example.bookMyShow.controller;

import com.example.bookMyShow.dto.AdminMovieRequest;
import com.example.bookMyShow.dto.AdminShowRequest;
import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.model.Show;
import com.example.bookMyShow.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    // add movie, show
    @Autowired private AdminService adminService;
    @PostMapping("/movie")
    public ResponseEntity<Movie> addMovie(@RequestBody AdminMovieRequest request) {
        return ResponseEntity.ok(adminService.addMovie(request));
    }
    @PostMapping("/show")
    public ResponseEntity<Show> addShow(@RequestBody AdminShowRequest request) {
        return ResponseEntity.ok(adminService.addShow(request));
    }
}

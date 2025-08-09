package com.example.bookMyShow.repository;

import com.example.bookMyShow.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatRepository extends JpaRepository<Seat, String> {
}

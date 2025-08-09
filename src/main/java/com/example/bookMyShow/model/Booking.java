package com.example.bookMyShow.model;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id private String id;
    private String userId;
    private String showId;

    @ElementCollection
    private List<String> seatIds;

    private String status; // CONFIRMED or CANCELLED
}

package com.example.bookMyShow.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    @Id private String id;
    private String movieId;
    private String theatreId;
    private LocalDateTime startTime;
}

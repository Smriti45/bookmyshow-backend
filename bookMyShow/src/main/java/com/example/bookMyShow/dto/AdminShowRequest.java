package com.example.bookMyShow.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AdminShowRequest {
    private String movieId;
    private String theatreId;
    private LocalDateTime startTime;
}

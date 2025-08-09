package com.example.bookMyShow.dto;

import lombok.Data;

@Data
public class AdminMovieRequest {
    private String title;
    private String genre;
    private String language;
}

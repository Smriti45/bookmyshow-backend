package com.example.bookMyShow.service;

import com.example.bookMyShow.dto.AdminMovieRequest;
import com.example.bookMyShow.dto.AdminShowRequest;
import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.model.Show;
import com.example.bookMyShow.repository.MovieRepository;
import com.example.bookMyShow.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class AdminService {
    @Autowired private MovieRepository movieRepository;
    @Autowired private ShowRepository showRepository;

    public Movie addMovie(AdminMovieRequest request) {
        Movie movie = new Movie(UUID.randomUUID().toString(), request.getTitle(), request.getGenre(), request.getLanguage());
        return movieRepository.save(movie);
    }
    public Show addShow(AdminShowRequest request) {
        Show show = new Show(UUID.randomUUID().toString(), request.getMovieId(), request.getTheatreId(), request.getStartTime());
        return showRepository.save(show);
    }
}

package com.example.bookMyShow.service;

import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.model.Show;
import com.example.bookMyShow.model.Theatre;
import com.example.bookMyShow.repository.MovieRepository;
import com.example.bookMyShow.repository.ShowRepository;
import com.example.bookMyShow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MovieSearchService {
    @Autowired private ShowRepository showRepository;
    @Autowired private MovieRepository movieRepository;
    @Autowired private TheatreRepository theatreRepository;
    public List<Movie> search(String city, LocalDate date) {
        List<Show> shows = showRepository.findAll();
        return shows.stream().filter(
                show -> {
                    Theatre theatre = theatreRepository.findById(show.getTheatreId()).orElse(null);
                    return theatre != null && theatre.getCity().equalsIgnoreCase(city) &&
                            show.getStartTime().toLocalDate().equals(date);
                }).map(
                        show -> movieRepository.findById(show.getMovieId()).orElse(null)
        ).filter(Objects::nonNull)
                .distinct().collect(Collectors.toList());
    }
}

package com.fcwebapp.movie_service.service;

import com.fcwebapp.movie_service.dto.MovieDto;
import com.fcwebapp.movie_service.dto.ShowtimeDto;

import java.util.List;


public interface MovieService {
    List<MovieDto> getAllMovies();


    MovieDto getMovieById(int id);

    MovieDto createMovie(MovieDto movieDto);

    MovieDto updateMovie(int id, MovieDto movieDto);

    void deleteMovie(int id);

    ShowtimeDto createShowtime(int movieId, ShowtimeDto showtimeDto);

}

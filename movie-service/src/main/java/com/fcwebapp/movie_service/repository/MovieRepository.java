package com.fcwebapp.movie_service.repository;

import com.fcwebapp.movie_service.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findByTitle(String title);
    List<Movie> getMoviesByGenre(String genre);
    List<Movie> getMoviesByGenreAndRating(String genre, double rating);
    List<Movie> getMoviesByDescription(String description);
    List<Movie> getMoviesByRating(double rating);
    List<Movie> getMoviesByTitle(String title);
}

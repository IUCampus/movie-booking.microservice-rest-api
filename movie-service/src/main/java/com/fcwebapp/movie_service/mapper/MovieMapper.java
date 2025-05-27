package com.fcwebapp.movie_service.mapper;

import com.fcwebapp.movie_service.dto.MovieDto;
import com.fcwebapp.movie_service.entity.Movie;

public class MovieMapper {
    public static MovieDto mapToMovieDto(Movie movie) {
        MovieDto movieDto = new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getDescription(),
                movie.getGenre(),
                movie.getRating(),
                movie.getShowtimes()
        );
        return movieDto;
    }

    public static Movie mapToMovie(MovieDto movieDto){
        Movie movie = new Movie(
                movieDto.getId(),
                movieDto.getTitle(),
                movieDto.getDescription(),
                movieDto.getGenre(),
                movieDto.getRating(),
                movieDto.getShowTimes()
        );
        return movie;
    }
}

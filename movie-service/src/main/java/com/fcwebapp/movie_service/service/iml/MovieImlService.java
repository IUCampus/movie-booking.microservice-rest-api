package com.fcwebapp.movie_service.service.iml;

import com.fcwebapp.movie_service.dto.MovieDto;
import com.fcwebapp.movie_service.dto.ShowtimeDto;
import com.fcwebapp.movie_service.entity.Movie;
import com.fcwebapp.movie_service.entity.Showtime;
import com.fcwebapp.movie_service.mapper.MovieMapper;
import com.fcwebapp.movie_service.mapper.ShowtimeMapper;
import com.fcwebapp.movie_service.repository.MovieRepository;
import com.fcwebapp.movie_service.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieImlService implements MovieService {

    private MovieRepository movieRepository;


    @Override
    public List<MovieDto> getAllMovies() {
        return movieRepository.findAll().stream()
                .map(MovieMapper::mapToMovieDto)
                .toList();
    }

    @Override
    public MovieDto getMovieById(int id) {
        return movieRepository.findById(id).map(movie -> new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getDescription(),
                movie.getGenre(),
                movie.getRating(),
                movie.getShowtimes()
        )).orElse(null);
    }

    @Override
    public MovieDto createMovie(MovieDto movieDto) {
        Movie movie = MovieMapper.mapToMovie(movieDto);
        Movie savedMovie = movieRepository.save(movie);
        return MovieMapper.mapToMovieDto(savedMovie);
    }

    @Override
    public MovieDto updateMovie(int id, MovieDto movieDto) {
        Movie movie = movieRepository.findById(id).orElse(null);

        if (movie != null) {
            movie.setTitle(movieDto.getTitle());
            movie.setDescription(movieDto.getDescription());
            movie.setGenre(movieDto.getGenre());
            movie.setRating(movieDto.getRating());
            Movie updatedMovie = movieRepository.save(movie);
            return MovieMapper.mapToMovieDto(updatedMovie);
        }
        return null;
    }

    @Override
    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    @Override
    public ShowtimeDto createShowtime(int movieId, ShowtimeDto showtimeDto) {
        Movie movie = movieRepository.findById(movieId).orElse(null);
        if (movie != null) {
            Showtime showtime = ShowtimeMapper.mapToShowtimeEntity(showtimeDto);
            showtime.setMovie(movie);
            movie.getShowtimes().add(showtime);
            movieRepository.save(movie);
            return ShowtimeMapper.mapToShowtimeDto(showtime);

        }
        return null;

    }
}

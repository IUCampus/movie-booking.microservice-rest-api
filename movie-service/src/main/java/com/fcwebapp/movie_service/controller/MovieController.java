package com.fcwebapp.movie_service.controller;

import com.fcwebapp.movie_service.dto.MovieDto;
import com.fcwebapp.movie_service.dto.ShowtimeDto;
import com.fcwebapp.movie_service.entity.Movie;
import com.fcwebapp.movie_service.repository.MovieRepository;
import com.fcwebapp.movie_service.service.iml.MovieImlService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(
        name = "Movie Microservice - MovieController",
        description = "Controller for managing movies and their show times"
)
@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieRepository movieRepository;

    @Autowired private MovieImlService movieImlService;

    @Operation(summary = "Get all movies", description = "Retrieve a list of all movies")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "HTTP Status 200", description = "Success")
    })
    @GetMapping
    public ResponseEntity<List<MovieDto>> getAllMovies() {
     List<MovieDto> movies = movieImlService.getAllMovies();
     return ResponseEntity.ok(movies);
 }

    @Operation(summary = "Get a single movie by ID", description = "Retrieve details of a single movie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "HTTP Status 200", description = "Success")
    })
    // Get movie by id
    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getMovieById(int id) {
        MovieDto movie = movieImlService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }

    @Operation(summary = "Get a movie by title", description = "Retrieve details of a movie by title")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "HTTP Status 200", description = "Success")
    })
    // Get movie by title
    @GetMapping("/title/{title}")
    public ResponseEntity<Movie> getMovieByTitle(String title) {
        Movie movieEntity = movieRepository.findByTitle(title);
        if (movieEntity != null) {
            return ResponseEntity.ok(movieEntity);
        }
        return ResponseEntity.notFound().build();
    }

    @Operation(summary = "Create a new movie", description = "Create a new movie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "HTTP Status 201", description = "Created")
    })
    // create new movie
    @PostMapping("/create")
    public ResponseEntity<MovieDto> createMovie(@RequestBody MovieDto movieDto) {
        MovieDto createdMovie = movieImlService.createMovie(movieDto);
        return ResponseEntity.ok(createdMovie);
    }

    @Operation(summary = "Update a movie", description = "Update an existing movie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "HTTP Status 201", description = "Success")
    })
    // update movie
    @PutMapping("/{id}")
    public ResponseEntity<MovieDto> updateMovie(@PathVariable int id, @RequestBody MovieDto updatedMovie) {
        MovieDto existingMovie = movieImlService.updateMovie(id, updatedMovie);
        if (existingMovie != null) {
            return ResponseEntity.ok(existingMovie);
        }
        return ResponseEntity.notFound().build();
    }

    @Operation(summary = "Delete a movie", description = "Delete an existing movie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "HTTP Status 200", description = "Success")
    })
    // delete movie
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        movieImlService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Create all show times for a movie", description = "Create a list of all show times for a movie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "HTTP Status 201", description = "Created")
    })
    // create Showtime
    @PostMapping("/{movieId}/showtimes")
    public ResponseEntity<ShowtimeDto> createShowtime(
            @PathVariable int movieId, @RequestBody ShowtimeDto showtimeDto) {
        ShowtimeDto createdShowtime = movieImlService.createShowtime(movieId, showtimeDto);
        return ResponseEntity.ok(createdShowtime);
    }

}

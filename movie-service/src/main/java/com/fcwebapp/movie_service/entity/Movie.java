package com.fcwebapp.movie_service.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Schema(description = "Movie Entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "movie-microservice")
public class Movie extends BaseEntity{
    @Id
    @GeneratedValue
    private int id;

    @Schema(description = "Title of the movie", example = "The Shawshank Redemption")
    private String title;

    @Schema(description = "Description of the movie",
            example = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through")
    private String description;

    @Schema(description = "Release date of the movie", example = "1994-09-23")
    private String genre;

    @Schema(description = "Release date of the movie", example = "1994-09-23")
    private Double rating;

    @Schema(description = "Release date of the movie", example = "1994-09-23")
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Showtime> showtimes;
    // Getters and Setters
}

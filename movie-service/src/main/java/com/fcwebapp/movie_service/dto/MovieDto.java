package com.fcwebapp.movie_service.dto;

import com.fcwebapp.movie_service.entity.Showtime;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Schema(description = "Movie DTO model Information")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    @Id
    @GeneratedValue
    private int id;

    @Schema(description = "Movie Title", example = "The Shawshank Redemption")
    private String title;

    @Schema(description = "Movie Description", example = "Two imprisoned men bond over a number of years")
    private String description;

   /* @Schema(description = "Movie Release Year", example = "1994")
    private int releaseYear;

    @Schema(description = "Movie Duration", example = "142")
    private int duration;*/

    @Schema(description = "Movie Genre", example = "Drama")
    private String genre;

    @Schema(description = "Movie Rating", example = "9.3")
    private Double rating;

    @Schema(description = "Movie Show times")
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Showtime> showTimes;
    // Getters and Setters
}

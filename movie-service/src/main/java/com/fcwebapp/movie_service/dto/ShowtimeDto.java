package com.fcwebapp.movie_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fcwebapp.movie_service.entity.Movie;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Schema(description = "Show times DTO for Movie entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowtimeDto {
    @Id
    @GeneratedValue
    private Long id;

@Schema(description = "Show time", example = "14:00")
    private LocalDateTime time = LocalDateTime.now();

@Schema(description = "Theater", example = "Cinema One")
    private String theater;

@Schema(description = "Available Seats", example = "100")
    private int availableSeats;

@Schema(description = "Movie Id", example = "1")
    @ManyToOne
    private Movie movie;
    // Getters and Setters
}

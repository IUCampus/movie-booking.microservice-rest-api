package com.fcwebapp.movie_service.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Schema(description = "Show time entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "show-time")
public class Showtime extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    @Schema(description = "Show time", example = "14:00")
    private LocalDateTime time;

    @Schema(description = "Theater", example = "Cinema One")
    private String theater;

    @Schema(description = "Available seats", example = "100")
    private int availableSeats;

    @Schema(description = "Movie", example = "Movie One")
    @ManyToOne
    private Movie movie;
    // Getters and Setters
}

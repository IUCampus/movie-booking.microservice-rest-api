package com.fcwebapp.movie_service.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Showtime {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime time;
    private String theater;
    private int availableSeats;
    @ManyToOne
    private Movie movie;
    // Getters and Setters
}

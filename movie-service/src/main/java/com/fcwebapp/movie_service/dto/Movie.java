package com.fcwebapp.movie_service.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String genre;
    private Double rating;
    // OneToMany
    @OneToMany(mappedBy = "movie")
    private List<Showtime> showtimes;
    // Getters and Setters
}

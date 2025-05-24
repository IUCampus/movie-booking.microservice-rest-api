package com.fcwebapp.booking_service.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String genre;
    private Double rating;
    private Long showtimesId;
    // Getters and Setters
}

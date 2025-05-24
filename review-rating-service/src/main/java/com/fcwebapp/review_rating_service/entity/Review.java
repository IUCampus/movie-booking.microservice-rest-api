package com.fcwebapp.review_rating_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;


    private Long userId;


    private Long movieId;

    private int rating; // e.g., 1 to 5
    private String comment;

    private LocalDateTime reviewDate;

    // Getters, setters, constructors
}


package com.fcwebapp.booking_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "booking-microservice")
public class Booking {
    @Id
    @GeneratedValue
    private Long id;

    private Long showtimeId;

    @ElementCollection
    private List<String> seatNumbers;

    private boolean confirmed;
    // Getters and Setters
}
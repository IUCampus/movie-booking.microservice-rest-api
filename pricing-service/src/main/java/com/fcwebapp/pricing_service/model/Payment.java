package com.fcwebapp.pricing_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "payment-method")
public class Payment {
    @Id
    @GeneratedValue
    private Long id;

    private String transactionId;
    private double amount;
    private String method; // e.g., Stripe, PayPal

    //@OneToOne
    private long bookingId;

    private LocalDateTime paymentDate;
    private String status; // SUCCESS, FAILED, PENDING

    // Getters, setters, constructors
}


package com.fcwebapp.pricing_service.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private Long id;
    private String method;
    private Double amount;
    private String transactionId;
    private String status;
    @OneToOne
    private Long bookingId;
    // Getters and Setters
}

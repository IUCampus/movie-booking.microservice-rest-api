package com.fcwebapp.pricing_service.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "pricing-dto")
public class PricingDto {
    @Id
    @GeneratedValue
    private Long id;
    private Long movieId;
    private Double basePrice;
    private Double discount;
    private String offerDescription;
    // Getters and Setters
}

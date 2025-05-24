package com.fcwebapp.customer_service.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String role; // e.g., ADMIN or CUSTOMER
    private String email;
    // Getters and Setters
}

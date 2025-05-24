package com.fcwebapp.customer_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "customer_microservice")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password; // Should be stored hashed
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN, CUSTOMER

    // Getters, setters, constructors
}

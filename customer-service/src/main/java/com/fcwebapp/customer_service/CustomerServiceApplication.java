package com.fcwebapp.customer_service;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Movie Booking System APIs",
				description = "Customer Microservice REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Chigozie Francis",
						email = "chigozie-cyriscus.francis@iu-study.org",
						url = "https://github.com/ChigozieFrancis"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Movie Microservice Docs",
				url = "https://github.com/IUCampus/movie-booking.microservice/tree/master/customer-service"
		)
)

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}

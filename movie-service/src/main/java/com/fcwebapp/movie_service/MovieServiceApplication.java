package com.fcwebapp.movie_service;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@OpenAPIDefinition(
		info = @Info(
				title = "Movie Booking System APIs",
				description = "Movie Microservice REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Chigozie Francis",
						email = "chigozie-cyriscus.francis@iu-study.org",
						url = "https://github.com/francisChigozie"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Movie Booking System GitHub Docs",
				url = "https://github.com/IUCampus/movie-booking.microservice/tree/master/movie-service"
		)
)

@SpringBootApplication
public class MovieServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieServiceApplication.class, args
		);

	}

}

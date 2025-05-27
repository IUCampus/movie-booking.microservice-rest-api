# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17-slim AS build
COPY . .

# Stage 2: Run the application
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/movie-service-0.0.1-SNAPSHOT.jar movie-service.jar
EXPOSE 8003
ENTRYPOINT ["java", "-jar", "movie-service.jar"]

# Stage 1: Build
FROM maven:3.8.5-openjdk-17-slim AS build
COPY . .
# Stage 2: Run
FROM openjdk:17.0.1-jdk-slim

# Copy built jar from the first stage
COPY --from=build /target/movie-service-0.0.1-SNAPSHOT.jar movie-service.jar

EXPOSE 8003
ENTRYPOINT ["java", "-jar", "movie-service.jar"]

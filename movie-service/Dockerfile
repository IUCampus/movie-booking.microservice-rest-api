# Stage 1: Build the project
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
RUN mvn clean package -DskipTests

# Stage 2: Run the project
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/movie-service-0.0.1-SNAPSHOT.jar movie-service.jar
EXPOSE 8003
ENTRYPOINT ["java", "-jar", "movie-service.jar"]

# Stage 1: Build
FROM maven:3.8.5-openjdk-17-slim AS build

WORKDIR /app

# Copy pom.xml and download dependencies first (cache optimization)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Build the jar
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app

# Copy built jar from the first stage
COPY --from=build /app/target/movie-service-0.0.1-SNAPSHOT.jar movie-service.jar

EXPOSE 8003
ENTRYPOINT ["java", "-jar", "movie-service.jar"]

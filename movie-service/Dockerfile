FROM maven:3.8.5-openjdk-17 AS build
COPY . .

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/movie-service-0.0.1-SNAPSHOT.jar movie-service.jar
EXPOSE 8003
ENTRYPOINT ["java", "-jar","movie-service.jar"]
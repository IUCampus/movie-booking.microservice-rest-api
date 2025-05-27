FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY target/movie-service-0.0.1-SNAPSHOT.jar movie-service.jar
EXPOSE 8003
ENTRYPOINT ["java", "-jar", "movie-service.jar"]

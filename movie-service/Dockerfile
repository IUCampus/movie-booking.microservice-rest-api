FROM maven:3.8-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21
COPY --from=build /target/movie-service-0.0.1-SNAPSHOT.jar movie-service.jar
EXPOSE 8003
ENTRYPOINT ["java", "-jar","movie-service.jar"]
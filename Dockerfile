# Use official lightweight JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside the container
WORKDIR /empawar

# Copy the built JAR file into the container
COPY target/*.jar empawar.jar

# Expose the port your Spring Boot app listens on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "empawar.jar"]

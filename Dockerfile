# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the built JAR file from the builder image
COPY  build/libs/wine-0.0.1-SNAPSHOT.jar /app/wine.jar

# Expose the port the app runs on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "wine.jar"]

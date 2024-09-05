# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file into the container at /app
COPY target/todo-app-0.0.1-SNAPSHOT.jar /app/todo-app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java","-jar","/app/todo-app.jar"]

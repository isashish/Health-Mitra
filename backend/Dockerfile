# Use official Java image
FROM eclipse-temurin:22-jdk

# Set working directory
WORKDIR /app

# Copy jar file
COPY build/libs/healthmitra-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","app.jar"]
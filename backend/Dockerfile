# ---------- Stage 1: Build ----------
FROM eclipse-temurin:22-jdk AS builder

WORKDIR /app

# Copy everything
COPY . .

# Give permission to gradlew
RUN chmod +x gradlew

# Build the project
RUN ./gradlew build -x test

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:22-jdk

WORKDIR /app

# Copy jar from builder stage
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
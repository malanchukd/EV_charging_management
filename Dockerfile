# ---- Build Stage ----
FROM maven:3.9.12-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy pom.xml and download dependencies first (layer caching)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source and build
COPY src ./src
RUN mvn clean package -DskipTests -B

# ---- Run Stage ----
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Create non-root user for security
RUN addgroup --system spring && adduser --system --ingroup spring spring

COPY --from=builder /app/target/*.war app.war

RUN chown spring:spring app.war
USER spring

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.war"]

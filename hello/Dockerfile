FROM eclipse-temurin:17.0.6_10-jdk-alpine
WORKDIR /app
COPY . .
RUN ./mvnw package
CMD ["java", "-jar", "./target/demo.jar"]
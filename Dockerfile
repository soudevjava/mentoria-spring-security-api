FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/mentoria-spring-security-api-0.0.1-SNAPSHOT.jar /app/api.jar
RUN chmod 755 /app/api.jar
CMD ["java", "-jar", "/app/api.jar"]

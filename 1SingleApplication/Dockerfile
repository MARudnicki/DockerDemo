FROM openjdk:8-jdk-slim
ADD /build/libs/1SingleApplication-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT exec java -jar /app.jar
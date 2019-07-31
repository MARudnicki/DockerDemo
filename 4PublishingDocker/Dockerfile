FROM openjdk:8-jdk-slim
ADD /build/libs/4PublishingDocker-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 80
ENTRYPOINT exec java -jar /app.jar
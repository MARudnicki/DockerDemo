FROM openjdk:8-jdk-slim
VOLUME /tmp
ADD /build/libs/3CommunicationWithDocker-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT exec java -jar /app.jar
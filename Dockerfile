FROM openjdk:21-jdk-alpine

EXPOSE 8080

ADD target/docker-0.0.1-SNAPSHOT.jar app.jar

RUN app.jar

CMD ["java", "-jar", "app.jar"]




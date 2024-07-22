FROM openjdk:20-jdk-slim

WORKDIR /app
#exposing port outside container
EXPOSE 8080

#copy jar file intp the container
ADD target/spring-docker.jar spring-docker.jar

ENTRYPOINT ["java", "-jar", "/app/spring-docker.jar"]

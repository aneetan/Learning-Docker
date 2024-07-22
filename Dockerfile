FROM openjdk:20

#exposing port outside container
EXPOSE 8080

ADD target/spring-docker.jar spring-docker.jar

ENTRYPOINT ["java", "-jar", "/spring-docker.jar"]

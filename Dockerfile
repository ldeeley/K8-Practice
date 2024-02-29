FROM openjdk:17
LABEL authors="lester"
ADD target/k8-docker.jar k8-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/k8-docker.jar"]

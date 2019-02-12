FROM openjdk:8
MAINTAINER Caspar
LABEL app="employee-service" version="0.0.1" by="caspar"
COPY ./build/libs/department-service-0.0.1-SNAPSHOT.jar department-service.jar
CMD java -jar department-service.jar --spring.profiles.active=${env}

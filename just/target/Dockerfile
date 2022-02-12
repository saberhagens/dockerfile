FROM ubuntu:18.04

RUN apt-get update && \
    apt-get install -y openjdk-11-jre-headless && \
    apt-get clean;

ARG JAR_FILE=*.jar
COPY ${JAR_FILE} just.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/just.jar"]

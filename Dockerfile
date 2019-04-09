FROM openjdk:11.0.2-jre-slim
MAINTAINER occidere@naver.com

RUN mkdir -p /home1/irteam/apps /home1/irteam/deploy /home1/irteam/logs

COPY build/libs/team-reddit.jar /home1/irteam/deploy/

WORKDIR /home1/irteam

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/home1/irteam/deploy/team-reddit.jar" ]


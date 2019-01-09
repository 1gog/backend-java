FROM 1gog/openjdk:10.0.2
LABEL APP=APPNAME
LABEL VERSION=APPVERSION
RUN mkdir -p /opt/app && mkdir -p /opt/app/src/main/resources/flyway/migrations/

COPY target/*.jar /opt/app/
COPY src/main/resources/flyway/migrations/* /opt/app/src/main/resources/flyway/migrations/
COPY src/main/resources/application*.properties /opt/app/src/main/resources/
WORKDIR /opt/app
EXPOSE 8080
CMD ["java","-jar","test-ci-cd-0.0.1-SNAPSHOT.jar","--spring.profiles.active=dev"]



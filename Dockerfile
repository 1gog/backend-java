FROM 1gog/openjdk:10.0.2
RUN mkdir -p /opt/app
COPY target/*.jar /opt/app/
WORKDIR /opt/app
EXPOSE 8080
CMD ["java","-jar","test-ci-cd-0.0.1-SNAPSHOT.jar"]



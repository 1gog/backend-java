FROM 1gog/openjdk:10.0.2
RUN mkdir -p /opt/app
COPY target/*.jar /opt/app/
WORKDIR /opt/app
CMD ["java","-jar","*.jar"]


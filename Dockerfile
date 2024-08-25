FROM openjdk:17-oracle
VOLUME /temp
COPY target/cloudsql-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java" ,"-jar","app.jar"]
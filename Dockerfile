FROM openjdk:8
EXPOSE 8080
ADD target/demo-image.jar demo-image.jar
ENTRYPOINT ["java","-jar","/demo-image.jar"]
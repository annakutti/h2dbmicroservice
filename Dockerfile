FROM openjdk:8
ADD target/h2dbmicroservice.jar h2dbmicroservice.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","h2dbmicroservice.jar"]
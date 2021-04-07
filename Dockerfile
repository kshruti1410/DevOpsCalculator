FROM openjdk:8
EXPOSE 8080
ADD target/DevOpsCalculator.jar DevOpsCalculator.jar
ENTRYPOINT ["java","-jar","/DevOpsCalculator.jar"]
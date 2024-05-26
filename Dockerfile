FROM openjdk:8
EXPOSE 8080
ADD target/github-actions-test101.jar github-actions-test101.jar
ENTRYPOINT ["java","-jar","/github-actions-test101.jar"]
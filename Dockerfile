FROM amazoncorretto:15
EXPOSE 8090
ADD target/spring-docker.jar spring-docker.jar
COPY Text.txt ./
COPY Result.txt ./
ENTRYPOINT ["java", "-jar", "spring-docker.jar"]

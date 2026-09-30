FROM eclipse-temurin:11-jre

WORKDIR /app

COPY target/spring-boot-web.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
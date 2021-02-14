FROM openjdk:11-jre-slim
VOLUME /tmp
ADD target/bacchus-auctions-back-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

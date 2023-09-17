FROM maven:3.9.4-amazoncorretto-17 AS builder

WORKDIR /app

COPY . .

RUN mvn clean package

FROM amazoncorretto:17-alpine

WORKDIR /app

COPY --from=builder /app/target/DataSynchronizer-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

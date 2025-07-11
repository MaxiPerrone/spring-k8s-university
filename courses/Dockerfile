FROM eclipse-temurin:21-jdk-alpine as builder

WORKDIR /app/courses

COPY ./pom.xml /app
COPY ./courses/.mvn ./.mvn
COPY ./courses/mvnw .
COPY ./courses/pom.xml .

RUN ./mvnw dependency:go-offline
COPY ./courses/src ./src

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app
RUN mkdir ./logs
COPY --from=builder /app/courses/target/courses-0.0.1-SNAPSHOT.jar .
EXPOSE 8002

CMD ["java", "-jar", "courses-0.0.1-SNAPSHOT.jar"]
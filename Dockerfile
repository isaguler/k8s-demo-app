FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package -Dmaven.test.skip

FROM openjdk:17-jdk-slim
WORKDIR k8s-demo-app
COPY --from=build target/*.jar k8s-demo-app.jar
ENTRYPOINT ["java", "-jar", "k8s-demo-app.jar"]
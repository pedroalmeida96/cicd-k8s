FROM openjdk:17-jdk
WORKDIR /app
COPY /build/libs/cicd-k8s-0.0.1-SNAPSHOT.jar /app/cicd-k8s.jar
EXPOSE 8080
CMD ["java", "-jar", "cicd-k8s.jar"]
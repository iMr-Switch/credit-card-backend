FROM openjdk:8
ADD target/credit-card-backend.jar credit-card-backend.jar
ENV POSTGRES_HOST localhost:5432
ENV POSTGRES_USERNAME postgres
ENV POSTGRES_PASSWORD admin
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "credit-card-backend.jar"]


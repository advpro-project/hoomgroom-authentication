FROM gradle:jdk21-alpine
ARG PRODUCTION
ARG JDBC_DATABASE_PASSWORD
ARG JDBC_DATABASE_URL
ARG JDBC_DATABASE_USERNAME
ARG SECRET_KEY

ENV PRODUCTION ${PRODUCTION}
ENV JDBC_DATABASE_PASSWORD ${JDBC_DATABASE_PASSWORD}
ENV JDBC_DATABASE_URL ${JDBC_DATABASE_URL}
ENV JDBC_DATABASE_USERNAME ${JDBC_DATABASE_USERNAME}
ENV SECRET_KEY ${SECRET_KEY}

WORKDIR /app
COPY ./authentication-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java","-jar","authentication-0.0.1-SNAPSHOT.jar"]
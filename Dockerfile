FROM openjdk:8-jdk-alpine

  # Add Maintainer Info
LABEL maintainer="vikas.chauhan@7n.com"

  # Add a volume pointing to /tmp
VOLUME /tmp

  # Make port 8080 available to the world outside this container
EXPOSE 8081

  # The application's jar file
ARG JAR_FILE=./build/libs/Food-0.0.1-SNAPSHOT.jar

  # Add the application's jar to the container
ADD ${JAR_FILE} food.jar

  # Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/food.jar"]
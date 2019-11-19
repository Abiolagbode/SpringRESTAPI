# latest oracle openjdk is the basis
FROM openjdk:oracle
# copy jar file into container image under app directory
COPY target/waxnote-0.0.1-SNAPSHOT.jar app/waxnote-0.0.1-SNAPSHOT.jar
# expose server port accept connections
EXPOSE 8080
# start application
CMD ["java", "-jar", "app/waxnote-0.0.1-SNAPSHOT.jar"]
 
 
 # Start with a base image containing Java runtime
# FROM openjdk:8-jdk-alpine

# # Add Maintainer Info
# LABEL maintainer="gbodeabiola@gmail.com"

# # Add a volume pointing to /tmp
# VOLUME /tmp

# # Make port 8080 available to the world outside this container
# EXPOSE 3211

# # The application's jar file
# ARG JAR_FILE=target/waxnote-0.0.1-SNAPSHOT.jar

# # Add the application's jar to the container
# ADD ${JAR_FILE} waxnote.jar

# # Run the jar file 
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/waxnote.jar"]

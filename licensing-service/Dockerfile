#FROM openjdk:8-alpine
#LABEL maintainer="Aman Adhikari <adhikariaman01@gmail.com>"
## The application's jar file
#ARG JAR_FILE
#
## Add the application's jar to the container
#COPY /target/licensing-service-0.0.1-SNAPSHOT.jar app.jar
#
#RUN mkdir -p target/dependency && (cd target/dependency; jar -xf /app.jar)
##stage 2
##Same Java runtime
#FROM openjdk:8-alpine
#
##Add volume pointing to /tmp
#VOLUME /tmp
#
##Copy unpackaged application to new container
##ARG DEPENDENCY=/target/dependency
##COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
##COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
##COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
#
##execute the application
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:8-jdk-alpine
EXPOSE 8080
#ARG JAR_FILE=target/*.jar
ADD /target/licensing-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
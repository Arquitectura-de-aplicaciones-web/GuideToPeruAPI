FROM openjdk:18
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/Negocio-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} quide-to-peru.jar
ENTRYPOINT ["java","-jar","/guide-to-peru.jar"]
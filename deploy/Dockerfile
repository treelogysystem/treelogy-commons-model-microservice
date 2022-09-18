FROM openjdk:11
VOLUME /tmp
ADD ./target/template-back-0.0.1-SNAPSHOT.jar template.jar
ENTRYPOINT ["java","-jar","/template.jar"]
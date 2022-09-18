FROM openjdk:11
VOLUME /tmp
ADD /var/lib/jenkins/workspace/ogy-template-backend_feature_002/build-backend template.jar
ENTRYPOINT ["java","-jar","/template.jar"]
FROM openjdk:11

ARG artifactId
ARG version

ENV ARTIFACTID=$artifactId
ENV VERSION=$version

VOLUME /tmp
ADD ./target/$ARTIFACTID-$VERSION.jar template.jar
ENTRYPOINT ["java","-jar","/template.jar"]
FROM --platform=linux/amd64 amazoncorretto:17
VOLUME /tmp
RUN mkdir /application
WORKDIR /application
COPY ./build/libs/ /application/

ENV JAR_TARGET "webapp-java-sample.jar"
ENTRYPOINT ["sh","-c","java -jar ./${JAR_TARGET}"]

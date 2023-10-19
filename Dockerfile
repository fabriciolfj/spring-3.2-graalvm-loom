FROM amazoncorretto
COPY build/native/nativeCompile/ /springboot-graalvm-docker
CMD ["/springboot-graalvm-docker"]
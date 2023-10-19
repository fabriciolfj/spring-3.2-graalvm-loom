FROM ubuntu:22.04

COPY build/native/nativeCompile/test ./spring-app

RUN chmod +x spring-app

USER root

CMD ["./spring-app"]
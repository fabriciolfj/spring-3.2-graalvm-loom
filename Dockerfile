FROM openjdk:21-slim

WORKDIR /app

# Copia o binário nativo do diretório de build
COPY build/native/nativeCompile/test ./spring-app

RUN chmod +x ./spring-app

ENTRYPOINT ["./spring-app"]
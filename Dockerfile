# Use a imagem base do OpenJDK 22
FROM openjdk:22-jre-slim

# Adicione um volume apontando para /tmp
VOLUME /tmp

# Adicione o JAR da aplicação
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Configure a porta que a aplicação vai expor
EXPOSE 8080

# Execute a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]
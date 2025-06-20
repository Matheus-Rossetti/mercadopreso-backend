# Stage 1: Build do projeto com Maven
FROM maven:3.9.4-eclipse-temurin-17 AS build

WORKDIR /app

# Copia os arquivos do projeto
COPY pom.xml .
COPY src ./src

# Compila e empacota o projeto
RUN mvn clean package -DskipTests

# Stage 2: Executa a aplicação
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia o jar gerado no stage anterior
COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

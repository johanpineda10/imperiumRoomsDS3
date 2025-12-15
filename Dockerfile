#Imagen base de Java 17
FROM eclipse-temurin:17-jdk
# Carpeta de trabajo dentro del contenedor
WORKDIR /app
# Copia el .jar generado por Maven (lo haremos más adelante)
COPY target/*.jar app.jar
# Expone el puerto donde corre Spring Boot
EXPOSE 8081
# Comando para arrancar la app
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app/app.jar"]

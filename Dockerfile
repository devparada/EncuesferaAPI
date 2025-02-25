FROM sapmachine:17.0.14-ubuntu-noble

WORKDIR /home/app

# Copia el jar en el directorio de trabajo
COPY /target/encuesferaapi-0.0.1-SNAPSHOT.jar /home/app/encuesferaapi-0.0.1-SNAPSHOT.jar

EXPOSE 8081 8193

ENTRYPOINT ["java", "-jar", "encuesferaapi-0.0.1-SNAPSHOT.jar"]

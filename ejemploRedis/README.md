# Compilar proyecto

Este proyecto fue desarrollado con IntelliJ IDEA y para compilarlo con `gradle` se debe ejecutar la siguiente sentencia en la raiz del proyecto:

```shell
./gradlew jar
```

Para ejecutar el aplicativo como prueba, se debe escribir la siguiente sentencia en la raiz del proyecto:

```shell
java -jar build/libs/ejemploRedis-1.0-SNAPSHOT.jar
```

Para publicar o producir mensajes aleatorios, ejecutar la siguiente sentencia:

```shell
java -jar build/libs/ejemploRedis-1.0-SNAPSHOT.jar producer
```

Para consumir los mensajes de la cola, ejecutar la siguiente sentencia:

```shell
java -jar build/libs/ejemploRedis-1.0-SNAPSHOT.jar consumer
```



Fuente:

[Escalando servicios con Colas + Redis - YouTube](https://www.youtube.com/watch?v=mM_SROJZGwQ)



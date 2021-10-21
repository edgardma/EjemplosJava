# Ejemplo de Microservicios con Spring Framework | Service Discovery y Comunicación

### Ejecutar proyecto Spring:

```
mvn spring-boot:run
```



### Ejecutar el contendor de Consul:

```
sudo docker run --name=consul -p 8500:8500 consul
```



Para probar, se puede ejecutar dos instancias de la aplicación.



### Ejecutar Apache Kafka

Primero ejecutamos el Zookeeper:

```
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Seguidamente, ejecutamos el Apache Kafka:

```
bin/kafka-server-start.sh config/server.properties
```

Luego, necesitamos un "topic" (cola) en Kafka:

```
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic testspring
```

Con esto, ya se puede enviar mensajes desde una instancia de la aplicación.



*Fuente:*

https://www.albertcoronado.com/2020/08/20/microservicios-con-spring-framework-service-discovery-y-comunicacion/



[Microservicios con Spring Framework | Service Discovery y Comunicación - YouTube](https://www.youtube.com/watch?v=FPeI_7iFYDk)







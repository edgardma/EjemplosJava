# Ejemplo de Arquitectura Hexagonal en Java

Fuente: 

[Implementación de arquitecturas hexagonales - YouTube](https://www.youtube.com/watch?v=CycNkSXfXy8)

Código: 

[GitHub - acoronadoc/java-springboot-hexagonal-architecture-sample: Hexagonal architecture sample using Java and Springboot](https://github.com/acoronadoc/java-springboot-hexagonal-architecture-sample)

Para correr el proyecto, ejecutar la siguiente sentencia:

```sh
mvn clean spring-boot:run
```

Para probar el API, ejecutar desde el Postman (como POST):

```
http://localhost:8090/customer/create?name=aaaa&country=ES

http://localhost:8090/customer/create?name=bbbb&country=ES

http://localhost:8090/customer/getall

```



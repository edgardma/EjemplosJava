# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/#build-image)



Obtenido de la siguiente artículo: [Ejemplo de Circuit Breaker con Resilience4j en Spring Boot - Refactorizando](https://refactorizando.com/ejemplo-circuit-breaker-resilience4j-spring-boot/)

Para verificar el circuitBreaker, haga varias solicitudes a: 

http://localhost:8080/api/timeDelay/10

Para verificar el timelimiter, haga una solicitud a:

http://localhost:8080/api/timeout/5
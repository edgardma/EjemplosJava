package pe.com.dyd.ejemplos.spring.webflux.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import pe.com.dyd.ejemplos.spring.webflux.app.models.documents.Producto;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {

}

package pe.com.dyd.ejemplos.spring.webflux.client.app.models.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import pe.com.dyd.ejemplos.spring.webflux.client.app.models.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private WebClient client;

	@Override
	public Flux<Producto> findAll() {
		return client.get().accept(MediaType.APPLICATION_JSON_UTF8)
				.exchange()
				.flatMapMany(response -> response.bodyToFlux(Producto.class));
	}

	@Override
	public Mono<Producto> findById(String id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		
		return client.get().uri("/{id}", params)
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.retrieve()
				.bodyToMono(Producto.class);
				//.exchange()
				//.flatMap(response -> response.bodyToMono(Producto.class));
	}

	@Override
	public Mono<Producto> save(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Producto> update(Producto producto, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}

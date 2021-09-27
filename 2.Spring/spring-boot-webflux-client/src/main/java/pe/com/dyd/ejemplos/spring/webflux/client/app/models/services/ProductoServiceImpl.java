package pe.com.dyd.ejemplos.spring.webflux.client.app.models.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import pe.com.dyd.ejemplos.spring.webflux.client.app.models.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
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
		
		return client.get()
				.uri("/{id}", params)
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.retrieve()
				.bodyToMono(Producto.class);
				//.exchange()
				//.flatMap(response -> response.bodyToMono(Producto.class));
	}

	@Override
	public Mono<Producto> save(Producto producto) {
		return client.post()
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(BodyInserters.fromObject(producto))
				.retrieve()
				.bodyToMono(Producto.class);
	}

	@Override
	public Mono<Producto> update(Producto producto, String id) {
		return client.put()
				.uri("/{id}", Collections.singletonMap("id", id))
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.syncBody(producto)
				.retrieve()
				.bodyToMono(Producto.class);
	}

	@Override
	public Mono<Void> delete(String id) {
		return client.delete()
				.uri("/{id}", Collections.singletonMap("id", id))
				.exchange()
				.then();
	}

}

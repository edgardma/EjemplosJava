package pe.com.dyd.ejemplos.spring.webflux.client.app.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import pe.com.dyd.ejemplos.spring.webflux.client.app.models.Producto;
import pe.com.dyd.ejemplos.spring.webflux.client.app.models.services.ProductoService;
import reactor.core.publisher.Mono;

@Component
public class ProductoHandler {
	
	@Autowired
	private ProductoService service;
	
	public Mono<ServerResponse> listar(ServerRequest request) {
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(service.findAll(), Producto.class);
	}
	
	public Mono<ServerResponse> ver(ServerRequest request) {
		String id = request.pathVariable("id");
		
		return service.findById(id)
				.flatMap(p -> ServerResponse.ok()
						.contentType(MediaType.APPLICATION_JSON_UTF8)
						.syncBody(p))
				.switchIfEmpty(ServerResponse.notFound().build());
	}
	
}

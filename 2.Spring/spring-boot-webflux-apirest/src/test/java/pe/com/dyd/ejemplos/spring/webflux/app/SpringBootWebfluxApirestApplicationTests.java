package pe.com.dyd.ejemplos.spring.webflux.app;

import java.util.Collections;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import pe.com.dyd.ejemplos.spring.webflux.app.models.documents.Producto;
import pe.com.dyd.ejemplos.spring.webflux.app.models.services.ProductoService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootWebfluxApirestApplicationTests {
	
	@Autowired
	private WebTestClient client;
	
	@Autowired
	private ProductoService service;

	@Test
	public void listarTest1() {
		client.get()
		.uri("/api/v2/productos")
		.accept(MediaType.APPLICATION_JSON_UTF8)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
		.expectBodyList(Producto.class)
		.hasSize(11);
	}
	
	@Test
	public void listarTest2() {
		client.get()
		.uri("/api/v2/productos")
		.accept(MediaType.APPLICATION_JSON_UTF8)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
		.expectBodyList(Producto.class)
		.consumeWith(response -> {
			List<Producto> productos = response.getResponseBody();
			productos.forEach(p -> {
				System.out.println(p.getNombre());
			});
			
			Assertions.assertThat(productos.size() > 0).isTrue();
		});
	}
	
	@Test
	public void verTest1() {
		Producto producto = service.findByNombre("TV Panasonic").block();
		
		client.get()
		.uri("/api/v2/productos/{id}", Collections.singletonMap("id", producto.getId()))
		.accept(MediaType.APPLICATION_JSON_UTF8)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
		.expectBody()
		.jsonPath("$.id").isNotEmpty()
		.jsonPath("$.nombre").isEqualTo("TV Panasonic");
	}
	
	@Test
	public void verTest2() {
		Producto producto = service.findByNombre("TV Panasonic").block();
		
		client.get()
		.uri("/api/v2/productos/{id}", Collections.singletonMap("id", producto.getId()))
		.accept(MediaType.APPLICATION_JSON_UTF8)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
		.expectBody(Producto.class)
		.consumeWith(response -> {
			Producto p = response.getResponseBody();
			
			Assertions.assertThat(p.getId()).isNotEmpty();
			Assertions.assertThat(p.getId().length() > 0).isTrue();
			Assertions.assertThat(p.getNombre()).isEqualTo("TV Panasonic");
		});
	}

}

package pe.com.dyd.ejemplos.spring.webflux.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.dyd.ejemplos.spring.webflux.app.models.documents.Producto;
import pe.com.dyd.ejemplos.spring.webflux.app.models.services.ProductoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@GetMapping
	public Mono<ResponseEntity<Flux<Producto>>> lista() {
		return Mono.just(
				ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(service.findAll())
				);
	}
	
	@GetMapping("/{id}")
	public Mono<ResponseEntity<Producto>> ver(@PathVariable String id) {
		return service.findById(id).map(p -> ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(p))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}
	/*
	@GetMapping
	public Mono<ResponseEntity<Flux<Producto>>> lista3() {
		return Mono.just(
				ResponseEntity.ok(service.findAll())
				);
	}
	
	@GetMapping
	public Flux<Producto> lista2() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<ResponseEntity<Producto>> ver2(@PathVariable String id) {
		return service.findById(id).map(p -> ResponseEntity.ok(p));
	}
	*/
}

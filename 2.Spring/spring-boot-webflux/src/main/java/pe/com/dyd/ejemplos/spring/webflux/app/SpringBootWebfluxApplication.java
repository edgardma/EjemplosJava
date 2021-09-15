package pe.com.dyd.ejemplos.spring.webflux.app;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import pe.com.dyd.ejemplos.spring.webflux.app.models.documents.Categoria;
import pe.com.dyd.ejemplos.spring.webflux.app.models.documents.Producto;
import pe.com.dyd.ejemplos.spring.webflux.app.models.services.ProductoService;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringBootWebfluxApplication implements CommandLineRunner {
	
	@Autowired
	private ProductoService service;
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(SpringBootWebfluxApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mongoTemplate.dropCollection("productos").subscribe();
		mongoTemplate.dropCollection("categorias").subscribe();
		
		Categoria electronico = new Categoria("Electrónico");
		Categoria deporte = new Categoria("Deporte");
		Categoria computacion = new Categoria("Computación");
		Categoria muebles = new Categoria("Muebles");
		
		Flux.just(electronico, deporte, computacion, muebles)
			.flatMap(service::saveCategoria)
			.doOnNext(categoria -> {
				log.info("Categoria creada: " + categoria.getNombre() + ", Id: " + categoria.getId());
			})
			.thenMany(
					Flux.just(
							new Producto("TV Panasonic", 451.16, electronico), 
							new Producto("Camara Sony", 485.23, electronico), 
							new Producto("Laptop HP", 1485.99, computacion), 
							new Producto("Impresora Epson", 156.23, computacion), 
							new Producto("iPod Apple", 550.13, electronico), 
							new Producto("Labadora Samsung", 985.99, electronico),
							new Producto("Refrigerador LG", 1550.69, electronico),
							new Producto("Cocina Mabe", 100.02, electronico),
							new Producto("Bianchi Bicicleta", 100.02, deporte),
							new Producto("Zapatilla Nike", 100.02, deporte),
							new Producto("Cama 2 plazas", 100.02, muebles)
							
							)
						.flatMap(producto -> {
							producto.setCreatAt(new Date());
							return service.save(producto);
							})
					)
			.subscribe(producto -> log.info("Insert: " + producto.getId() + "-" + producto.getNombre()));
	}

}

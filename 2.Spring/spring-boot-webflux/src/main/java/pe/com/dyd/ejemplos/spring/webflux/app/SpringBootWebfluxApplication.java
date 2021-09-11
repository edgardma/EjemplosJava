package pe.com.dyd.ejemplos.spring.webflux.app;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.com.dyd.ejemplos.spring.webflux.app.models.dao.ProductoDao;
import pe.com.dyd.ejemplos.spring.webflux.app.models.documents.Producto;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringBootWebfluxApplication implements CommandLineRunner {
	
	@Autowired
	private ProductoDao dao;
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(SpringBootWebfluxApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Flux.just(
				new Producto("TV Panasonic", 451.16), 
				new Producto("Camara Sony", 485.23), 
				new Producto("Laptop HP", 1485.99), 
				new Producto("Impresora Epson", 156.23), 
				new Producto("iPod Apple", 550.13), 
				new Producto("Cocina Mabe", 100.02)
				)
		.flatMap(producto -> dao.save(producto))
		.subscribe(producto -> log.info("Insert: " + producto.getId() + "-" + producto.getNombre()));
	}

}

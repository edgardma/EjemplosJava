package pe.com.dyd.ejemplos.spring.reactor.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringBootReactorApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootReactorApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Imprimir en la consola
		Flux<String> nombres = Flux.just("Andres", "Pedro", "", "Diego", "Juan").
				doOnNext(e -> {
					if (e.isEmpty()) {
						throw new RuntimeException("Nombres no pueden ser vacíos");
					}
					System.out.println(e);
				});
		// Imprime en el log
		nombres.subscribe(
				e -> log.info(e),
				error -> log.error(error.getMessage()),
				new Runnable() {
					@Override
					public void run() {
						log.info("Ha finalizado la ejecución del observable con éxito!");
					}
				});
	}

}
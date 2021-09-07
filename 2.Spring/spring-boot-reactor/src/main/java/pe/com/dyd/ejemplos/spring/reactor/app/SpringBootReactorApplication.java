package pe.com.dyd.ejemplos.spring.reactor.app;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.com.dyd.ejemplos.spring.reactor.app.models.Comentarios;
import pe.com.dyd.ejemplos.spring.reactor.app.models.Usuario;
import pe.com.dyd.ejemplos.spring.reactor.app.models.UsuarioComentarios;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringBootReactorApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootReactorApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ejemploDelayElements();
	}
	
	private void ejemploDelayElements() throws InterruptedException {
		Flux<Integer> rango = Flux.range(1,  12)
				.delayElements(Duration.ofSeconds(1))
				.doOnNext(i -> log.info(i.toString()));
		//rango.blockLast(); // Bloquea
		
		rango.subscribe(); // No bloquea
		Thread.sleep(13000); // Espera Trece segundos
	}
	
	private void ejemploInterval() {
		Flux<Integer> rango = Flux.range(1,  12);
		Flux<Long> retraso = Flux.interval(Duration.ofSeconds(1));
		
		rango.zipWith(retraso, (ra, re) -> ra)
			.doOnNext(i -> log.info(i.toString()))
			//.subscribe(); // No bloquea
			.blockLast();  // Bloquea
	}
	
	private void ejemploZipWithRangos2() {
		Flux<Integer> rangos = Flux.range(0,  4);
		Flux.just(1, 2, 3, 4)
			.map(i -> (i * 2))
			.zipWith(rangos, (uno, dos) -> String.format("Primer Flux: %d, Segundo Flux: %d", uno, dos))
			.subscribe(texto -> log.info(texto));
	}
	
	private void ejemploZipWithRangos1() {
		Flux.just(1, 2, 3, 4)
			.map(i -> (i * 2))
			.zipWith(Flux.range(0, 4), (uno, dos) -> String.format("Primer Flux: %d, Segundo Flux: %d", uno, dos))
			.subscribe(texto -> log.info(texto));
	}
	
	private void ejemploUsuarioComentariosZipWithForma2() {
		Mono<Usuario> usuarioMono = Mono.fromCallable(() -> new Usuario("John", "Doe"));
		
		Mono<Comentarios> comentariosUsuarioMono = Mono.fromCallable(() -> {
			Comentarios comentarios = new Comentarios();
			comentarios.addComentario("Comentario 1");
			comentarios.addComentario("Comentario 2");
			comentarios.addComentario("Comentario 3");
			comentarios.addComentario("Comentario 4");
			comentarios.addComentario("Comentario 5");
			comentarios.addComentario("Comentario 6");
			return comentarios;
		});
		
		Mono<UsuarioComentarios> usuarioConComentarios = 
				usuarioMono.zipWith(comentariosUsuarioMono)
				.map(tuple -> {
					Usuario u = tuple.getT1();
					Comentarios c = tuple.getT2();
					return new UsuarioComentarios(u, c);
				});
		usuarioConComentarios.subscribe(uc -> log.info(uc.toString()));
	}
	
	private void ejemploUsuarioComentariosZipWith() {
		Mono<Usuario> usuarioMono = Mono.fromCallable(() -> new Usuario("John", "Doe"));
		
		Mono<Comentarios> comentariosUsuarioMono = Mono.fromCallable(() -> {
			Comentarios comentarios = new Comentarios();
			comentarios.addComentario("Comentario 1");
			comentarios.addComentario("Comentario 2");
			comentarios.addComentario("Comentario 3");
			comentarios.addComentario("Comentario 4");
			comentarios.addComentario("Comentario 5");
			comentarios.addComentario("Comentario 6");
			return comentarios;
		});
		
		Mono<UsuarioComentarios> usuarioConComentarios = 
				usuarioMono.zipWith(comentariosUsuarioMono, (usuario, comentariosUsuario) -> 
				new UsuarioComentarios(usuario, comentariosUsuario));
		usuarioConComentarios.subscribe(uc -> log.info(uc.toString()));
	}
	
	private void ejemploUsuarioComentariosFlatMap() {
		Mono<Usuario> usuarioMono = Mono.fromCallable(() -> new Usuario("John", "Doe"));
		
		Mono<Comentarios> comentariosUsuarioMono = Mono.fromCallable(() -> {
			Comentarios comentarios = new Comentarios();
			comentarios.addComentario("Comentario 1");
			comentarios.addComentario("Comentario 2");
			comentarios.addComentario("Comentario 3");
			comentarios.addComentario("Comentario 4");
			comentarios.addComentario("Comentario 5");
			comentarios.addComentario("Comentario 6");
			return comentarios;
		});
		
		usuarioMono.flatMap(u -> comentariosUsuarioMono.map(c -> new UsuarioComentarios(u, c)))
		.subscribe(uc -> log.info(uc.toString()));
	}
	
	private void ejemploCollectList() {
		List<Usuario> usuariosList = new ArrayList<>();
		usuariosList.add(new Usuario("Andres", "Guzman"));
		usuariosList.add(new Usuario("Pedro", "Fulano"));
		usuariosList.add(new Usuario("Maria", "Fulana"));
		usuariosList.add(new Usuario("Diego", "Sultano"));
		usuariosList.add(new Usuario("Juan", "Mengano"));
		usuariosList.add(new Usuario("Bruce", "Lee"));
		usuariosList.add(new Usuario("Bruce", "Willis"));
		
		Flux.fromIterable(usuariosList)
		.collectList()
		.subscribe(lista -> {
			lista.forEach(item -> log.info(item.toString()));
		});
	}
	
	private void ejemploToString() {
		List<Usuario> usuariosList = new ArrayList<>();
		usuariosList.add(new Usuario("Andres", "Guzman"));
		usuariosList.add(new Usuario("Pedro", "Fulano"));
		usuariosList.add(new Usuario("Maria", "Fulana"));
		usuariosList.add(new Usuario("Diego", "Sultano"));
		usuariosList.add(new Usuario("Juan", "Mengano"));
		usuariosList.add(new Usuario("Bruce", "Lee"));
		usuariosList.add(new Usuario("Bruce", "Willis"));
		
		Flux.fromIterable(usuariosList)
				.map(usuario -> usuario.getNombres().toUpperCase().concat(" ").concat(usuario.getApellidos().toUpperCase()))
				.flatMap(nombre -> {
					if(nombre.contains("BRUCE")) {
						return Mono.just(nombre);
					} else {
						return Mono.empty();
					}
				})
				.map(nombre -> {
					return nombre.toLowerCase();
				})
				.subscribe(e -> log.info(e.toString()));
	}
	
	private void ejemploFlatMap() {
		List<String> usuariosList = new ArrayList<>();
		usuariosList.add("Andres Guzman");
		usuariosList.add("Pedro Fulano");
		usuariosList.add("Maria Fulana");
		usuariosList.add("Diego Sultano");
		usuariosList.add("Juan Mengano");
		usuariosList.add("Bruce Lee");
		usuariosList.add("Bruce Willis");
		
		Flux.fromIterable(usuariosList)
				.map(nombre -> new Usuario(nombre.split(" ")[0].toUpperCase(), nombre.split(" ")[1].toUpperCase()))
				.flatMap(usuario -> {
					if(usuario.getNombres().equalsIgnoreCase("bruce")) {
						return Mono.just(usuario);
					} else {
						return Mono.empty();
					}
				})
				.map(usuario -> {
					String nombre = usuario.getNombres().toLowerCase();
					usuario.setNombres(nombre);
					return usuario;
				})
				.subscribe(
						e -> log.info(e.toString()));
	}
	
	private void prueba4() {
		List<String> usuariosList = new ArrayList<>();
		usuariosList.add("Andres Guzman");
		usuariosList.add("Pedro Fulano");
		usuariosList.add("Maria Fulana");
		usuariosList.add("Diego Sultano");
		usuariosList.add("Juan Mengano");
		usuariosList.add("Bruce Lee");
		usuariosList.add("Bruce Willis");
		
		Flux<String> nombres = Flux.fromIterable(usuariosList);
		Flux<Usuario> usuarios = nombres.map(nombre -> new Usuario(nombre.split(" ")[0].toUpperCase(), nombre.split(" ")[1].toUpperCase()))
				.filter(usuario -> {
					return usuario.getNombres().toLowerCase().equals("bruce");
				})
				.doOnNext(usuario -> {
					if (usuario == null) {
						throw new RuntimeException("Nombres no pueden ser vacíos");
					}
					System.out.println(usuario.getNombres().concat(" ").concat(usuario.getApellidos()));
				})
				.map(usuario -> {
					String nombre = usuario.getNombres().toLowerCase();
					usuario.setNombres(nombre);
					return usuario;
				});
		
		// Imprime en el log
		usuarios.subscribe(
				e -> log.info(e.toString()),
				error -> log.error(error.getMessage()),
				new Runnable() {
					@Override
					public void run() {
						log.info("Ha finalizado la ejecución del observable con éxito!");
					}
				});
	}
	
	private void prueba3() {
		// Imprimir en la consola
		Flux<String> nombres = Flux.just("Andres Guzman", "Pedro Fulano", "Maria Fulana", "Diego Sultano", "Juan Mengano", "Bruce Lee", "Bruce Willis");
		Flux<Usuario> usuarios = nombres.map(nombre -> new Usuario(nombre.split(" ")[0].toUpperCase(), nombre.split(" ")[1].toUpperCase()))
				.filter(usuario -> {
					return usuario.getNombres().toLowerCase().equals("bruce");
				})
				.doOnNext(usuario -> {
					if (usuario == null) {
						throw new RuntimeException("Nombres no pueden ser vacíos");
					}
					System.out.println(usuario.getNombres().concat(" ").concat(usuario.getApellidos()));
				})
				.map(usuario -> {
					String nombre = usuario.getNombres().toLowerCase();
					usuario.setNombres(nombre);
					return usuario;
				});
		
		// Imprime en el log
		usuarios.subscribe(
				e -> log.info(e.toString()),
				error -> log.error(error.getMessage()),
				new Runnable() {
					@Override
					public void run() {
						log.info("Ha finalizado la ejecución del observable con éxito!");
					}
				});
	}
	
	private void prueba2() {
		// Imprimir en la consola
		Flux<String> nombres = Flux.just("Andres Guzman", "Pedro Fulano", "Maria Fulana", "Diego Sultano", "Juan Mengano", "Bruce Lee", "Bruce Willis");
		nombres.map(nombre -> new Usuario(nombre.split(" ")[0].toUpperCase(), nombre.split(" ")[1].toUpperCase()))
				.filter(usuario -> {
					return usuario.getNombres().toLowerCase().equals("bruce");
				})
				.doOnNext(usuario -> {
					if (usuario == null) {
						throw new RuntimeException("Nombres no pueden ser vacíos");
					}
					System.out.println(usuario.getNombres().concat(" ").concat(usuario.getApellidos()));
				})
				.map(usuario -> {
					String nombre = usuario.getNombres().toLowerCase();
					usuario.setNombres(nombre);
					return usuario;
				});
		
		// Imprime en el log
		nombres.subscribe(
				e -> log.info(e.toString()),
				error -> log.error(error.getMessage()),
				new Runnable() {
					@Override
					public void run() {
						log.info("Ha finalizado la ejecución del observable con éxito!");
					}
				});
	}
	
	private void prueba1() {
		// Imprimir en la consola
		Flux<Usuario> nombres = Flux.just("Andres Guzman", "Pedro Fulano", "Maria Fulana", "Diego Sultano", "Juan Mengano", "Bruce Lee", "Bruce Willis")
				.map(nombre -> new Usuario(nombre.split(" ")[0].toUpperCase(), nombre.split(" ")[1].toUpperCase()))
				.filter(usuario -> {
					return usuario.getNombres().toLowerCase().equals("bruce");
				})
				.doOnNext(usuario -> {
					if (usuario == null) {
						throw new RuntimeException("Nombres no pueden ser vacíos");
					}
					System.out.println(usuario.getNombres().concat(" ").concat(usuario.getApellidos()));
				})
				.map(usuario -> {
					String nombre = usuario.getNombres().toLowerCase();
					usuario.setNombres(nombre);
					return usuario;
				});
		
		// Imprime en el log
		nombres.subscribe(
				e -> log.info(e.getNombres()),
				error -> log.error(error.getMessage()),
				new Runnable() {
					@Override
					public void run() {
						log.info("Ha finalizado la ejecución del observable con éxito!");
					}
				});
	}

}

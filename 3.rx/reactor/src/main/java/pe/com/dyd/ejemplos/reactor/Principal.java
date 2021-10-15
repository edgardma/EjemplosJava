package pe.com.dyd.ejemplos.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Principal {

	public static void main(String[] args) {
		ejemploMono();
		ejemploFlux();
	}
	
	private static void ejemploMono() {
		Mono<String> miMono = Mono.justOrEmpty("Hola");
		miMono.subscribe(System.out::println);
	}
	
	private static void ejemploFlux() {
		Flux<String> elementos = Flux.just("Hola", "que", "tal", "como", "estas");
		elementos.subscribe(System.out::println);
	}
}

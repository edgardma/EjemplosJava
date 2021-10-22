package pe.com.dyd.ejemplos.reactor;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Principal {

	public static void main(String[] args) {
		ejemploMono3();
		//ejemploMono2();
		//ejemploMono();
		//ejemploFlux();
	}
	
	private static void ejemploMono3() {
		Mono<String> miMono = Mono.justOrEmpty("Hola 1").delayElement(Duration.ofSeconds(2));
		Mono<String> miMono2 = Mono.justOrEmpty("Hola 2").delayElement(Duration.ofSeconds(3));
		
		Flux<String> combinar = Flux.merge(miMono, miMono2);
		combinar.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void ejemploMono2() {
		Mono<String> miMono = Mono.justOrEmpty("Hola 1").delayElement(Duration.ofSeconds(2));
		miMono.subscribe(System.out::println);
		
		Mono<String> miMono2 = Mono.justOrEmpty("Hola 2").delayElement(Duration.ofSeconds(3));
		miMono2.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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

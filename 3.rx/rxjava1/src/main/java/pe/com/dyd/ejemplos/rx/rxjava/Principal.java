package pe.com.dyd.ejemplos.rx.rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import pe.com.dyd.ejemplos.rx.rxjava.observers.MiObserver;

public class Principal {

	public static void main(String[] args) {
		//ejemplo1();
		//ejemplo2();
		//ejemplo3();
		ejemplo4();
	}
	
	private static void ejemplo1() {
		// Tenemos un observable
		Observable<String> lista =  Observable.just("hola", "que", "tal", "estas");
		
		// Nos suscribimos a �l
		// Eso nos envia el evento
		lista.subscribe(e-> System.out.println(e));
	}
	
	private static void ejemplo2() {
		// Tenemos un observable
		Observable<String> lista =  Observable.just("hola", "que", "tal", "estas");
		
		// Nos suscribimos a �l
		// Eso nos envia el evento
		lista.subscribe(new MiObserver());
		
		System.out.println("**************");
		
		lista.subscribe(new MiObserver());
	}
	
	private static void ejemplo3() {
		Observable<String> lista =  Observable.just("hola", "que", "tal", "estas");
		
		// Operacion de Transformacion
		lista.map(String::toUpperCase).subscribe(e-> System.out.println(e));
	}
	
	private static void ejemplo4() {
		Observable<Long> lista =  Observable.interval(1, TimeUnit.SECONDS);
		lista.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

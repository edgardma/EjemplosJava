package pe.com.dyd.ejemplos.rx.rxjava;

import io.reactivex.Observable;
import pe.com.dyd.ejemplos.rx.rxjava.observers.MiObserver;

public class Principal {

	public static void main(String[] args) {
		//ejemplo1();
		ejemplo2();
	}
	
	private static void ejemplo1() {
		// Tenemos un observable
		Observable<String> lista =  Observable.just("hola", "que", "tal", "estas");
		
		// Nos suscribimos a él
		// Eso nos envia el evento
		lista.subscribe(e-> System.out.println(e));
	}
	
	private static void ejemplo2() {
		// Tenemos un observable
		Observable<String> lista =  Observable.just("hola", "que", "tal", "estas");
		
		// Nos suscribimos a él
		// Eso nos envia el evento
		lista.subscribe(new MiObserver());
		
		System.out.println("**************");
		
		lista.subscribe(new MiObserver());
	}
}

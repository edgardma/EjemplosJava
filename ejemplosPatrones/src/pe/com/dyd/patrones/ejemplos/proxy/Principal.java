package pe.com.dyd.patrones.ejemplos.proxy;

public class Principal {
	public static void main(String[] args) {
		ServicioMensaje sm = new ServicioMensajeProxy();
		System.out.println(sm.mostrarMensaje("Edgard"));
	}
}

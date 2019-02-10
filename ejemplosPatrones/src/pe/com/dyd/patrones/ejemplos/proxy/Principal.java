package pe.com.dyd.patrones.ejemplos.proxy;

/*
 * Ejemplo de https://www.arquitecturajava.com/el-concepto-de-java-proxy-pattern/
 */

public class Principal {
	public static void main(String[] args) {
		ServicioMensaje sm = new ServicioMensajeProxy();
		System.out.println(sm.mostrarMensaje("Edgard"));
	}
}

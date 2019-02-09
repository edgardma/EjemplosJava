package pe.com.dyd.patrones.ejemplos.proxy;

public class ServicioMensajeProxy implements ServicioMensaje {
	private ServicioMensaje sm;
	
	public ServicioMensajeProxy() {
		super();
		this.sm = new ServicioMensajeImpl();
	}
	
	@Override
	public String mostrarMensaje(String persona) {
		System.out.println("log del mensaje para " + persona);
		return sm.mostrarMensaje(persona);
	}
}

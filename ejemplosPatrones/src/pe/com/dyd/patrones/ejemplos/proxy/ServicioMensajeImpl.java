package pe.com.dyd.patrones.ejemplos.proxy;

public class ServicioMensajeImpl implements ServicioMensaje {

	@Override
	public String mostrarMensaje(String persona) {
		return "Hola amigo " + persona;
	}

}

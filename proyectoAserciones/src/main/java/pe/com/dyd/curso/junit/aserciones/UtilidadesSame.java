package pe.com.dyd.curso.junit.aserciones;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesSame {
	private List<Persona> personas;
	
	public UtilidadesSame() {
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Carlos", "Romero"));
		personas.add(new Persona("Juan", "Lopez"));
	}
	
	public Persona devuelveObjeto(Persona persona) {
		if (personas.contains(persona)) {
			return persona;
		} else {
			return new Persona("Paco", "Martinez");
		}
	}
}

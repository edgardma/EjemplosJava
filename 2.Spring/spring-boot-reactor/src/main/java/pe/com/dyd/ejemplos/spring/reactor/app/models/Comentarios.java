package pe.com.dyd.ejemplos.spring.reactor.app.models;

import java.util.ArrayList;
import java.util.List;

public class Comentarios {
	private List<String> comentarios;
	
	public Comentarios() {
		this.comentarios = new ArrayList<>();
	}

	public void addComentario(String comentario) {
		this.comentarios.add(comentario);
	}

	@Override
	public String toString() {
		return "[comentarios=" + comentarios + "]";
	}
	
}

package pe.com.dyd.escuela;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	private String nombre;
	private List<Nota> notas = new ArrayList<Nota>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Nota> getNotas() {
		return notas;
	}
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	public Alumno() {
		super();
	}
	public Alumno(String nombre, List<Nota> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}
	
}

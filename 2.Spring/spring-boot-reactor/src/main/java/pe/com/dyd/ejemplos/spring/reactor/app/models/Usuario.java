package pe.com.dyd.ejemplos.spring.reactor.app.models;

public class Usuario {
	private String nombres;
	private String apellidos;
	
	public Usuario(String nombres, String apellidos) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}
}

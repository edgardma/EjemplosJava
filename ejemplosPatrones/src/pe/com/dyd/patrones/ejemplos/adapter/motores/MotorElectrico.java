package pe.com.dyd.patrones.ejemplos.adapter.motores;

public class MotorElectrico {
	private boolean conectado = false;
	
	public MotorElectrico() {
		System.out.println("Creando Motor Electrico");
		this.conectado = false;
	}
	
	public void conectar() {
		System.out.println("Conectando Motor Electrico");
		this.conectado = true;
	}
	
	public void activar() {
		if (!this.conectado) {
			System.out.println("No se puede activar porque no esta conectado el motor electrico");
		} else {
			System.out.println("Esta conectado, activando motor electrico...");
		}
	}
	
	public void moverMasRapido() {
		if (!this.conectado) {
			System.out.println("No se puede mover rapido el motor electrico porque no esta conectado");
		} else {
			System.out.println("Moviendo mas rapido... aumentado voltaje");
		}
	}
	
	public void detener() {
		if (!this.conectado) {
			System.out.println("No se puede detener el motor electrico porque no esta conectado");
		} else {
			System.out.println("Deteniendo el motor electrico");
		}
	}
	
	public void desconectar() {
		System.out.println("Desonectando Motor Electrico");
		this.conectado = false;
	}
}

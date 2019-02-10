package pe.com.dyd.patrones.ejemplos.flighweight;

public class MacLigero {
	private int ram;
	private int disco;
	private static int contador;
	
	public MacLigero(int ram, int disco) {
		super();
		this.ram = ram;
		this.disco = disco;
		contador++;
		System.out.println("contador ligero: " + contador);
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getDisco() {
		return disco;
	}
	public void setDisco(int disco) {
		this.disco = disco;
	}
	
	
}

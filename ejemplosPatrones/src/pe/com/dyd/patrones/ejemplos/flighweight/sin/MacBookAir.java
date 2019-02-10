package pe.com.dyd.patrones.ejemplos.flighweight.sin;

public class MacBookAir {
	private String id;
	private int ram;
	private int disco;
	private static int contador;
	
	public MacBookAir(String id, int ram, int disco) {
		super();
		this.id = id;
		this.ram = ram;
		this.disco = disco;
		contador++;
		System.out.println(contador);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

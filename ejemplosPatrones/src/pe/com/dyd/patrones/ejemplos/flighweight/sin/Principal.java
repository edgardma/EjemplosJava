package pe.com.dyd.patrones.ejemplos.flighweight.sin;

/*
 * Ejemplo de https://www.arquitecturajava.com/java-flyweight-pattern-rendimiento/
 */

public class Principal {
	public static void main(String[] args) {
		MacBookAir m1 = new MacBookAir("1", 4, 128);
		MacBookAir m2 = new MacBookAir("2", 4, 128);
		MacBookAir m3 = new MacBookAir("3", 8, 256);
		MacBookAir m4 = new MacBookAir("4", 8, 256);
	}
}

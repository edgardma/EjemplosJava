package pe.com.dyd.patrones.ejemplos.flighweight;

/*
 * Ejemplo de https://www.arquitecturajava.com/java-flyweight-pattern-rendimiento/
 */

public class Principal {
	public static void main(String[] args) {
		MacBookAir m1 = FactoriaMacs.crearMacBookAir("1", 4, 128);
		MacBookAir m2 = FactoriaMacs.crearMacBookAir("2", 4, 128);
		MacBookAir m3 = FactoriaMacs.crearMacBookAir("3", 8, 256);
		MacBookAir m4 = FactoriaMacs.crearMacBookAir("4", 8, 256);
	}
}

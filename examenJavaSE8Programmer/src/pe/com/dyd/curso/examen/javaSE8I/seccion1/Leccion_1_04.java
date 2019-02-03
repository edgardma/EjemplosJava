/*
 * Sentencia para compilar y ejecutar esta clase por línea de comando (se ejecuta desde la raiz del proyecto):
 * javac -d bin src\pe\com\dyd\curso\examen\javaSE8I\seccion1\Leccion_1_04.java
 * java -cp bin pe/com/dyd/curso/examen/javaSE8I/seccion1/Leccion_1_04
 * */
package pe.com.dyd.curso.examen.javaSE8I.seccion1;

public class Leccion_1_04 {
	public static void main(String[] args) {
		Coche c = new Coche();
		System.out.println(c.numPuertas);
	}
}

class Coche {
	int numPuertas = 1;
	
	public Coche() {
		System.out.println("En constructor de la clase Coche");
		numPuertas = 2;
	}
	
	{ System.out.println("En bloque 1"); numPuertas = 3; }
	
	{ System.out.println("En bloque 2"); numPuertas = 4; }
}

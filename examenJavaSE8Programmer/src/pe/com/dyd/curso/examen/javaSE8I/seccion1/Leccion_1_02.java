/*
 * Sentencia para compilar y ejecutar esta clase por línea de comando (se ejecuta desde la raiz del proyecto):
 * javac -d bin src\pe\com\dyd\curso\examen\javaSE8I\seccion1\Leccion_1_02.java
 * java -classpath bin pe/com/dyd/curso/examen/javaSE8I/seccion1/Leccion_1_02 Parametro
 * */
package pe.com.dyd.curso.examen.javaSE8I.seccion1;

public class Leccion_1_02 {
	public static void main(String[] args) {
		System.out.println("Hola mundo.");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}

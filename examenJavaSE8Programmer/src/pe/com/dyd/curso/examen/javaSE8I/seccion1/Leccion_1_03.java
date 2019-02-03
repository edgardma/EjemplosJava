/*
 * Sentencia para compilar y ejecutar esta clase por línea de comando (se ejecuta desde la raiz del proyecto):
 * javac -d bin src\pe\com\dyd\curso\examen\javaSE8I\seccion1\Leccion_1_03.java
 * java -cp bin pe/com/dyd/curso/examen/javaSE8I/seccion1/Leccion_1_03
 * */
package pe.com.dyd.curso.examen.javaSE8I.seccion1;

import java.util.Random;

public class Leccion_1_03 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextDouble());
		
		java.util.Date date1 = new java.util.Date();
		java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(date1);
		System.out.println(date2);
	}
}

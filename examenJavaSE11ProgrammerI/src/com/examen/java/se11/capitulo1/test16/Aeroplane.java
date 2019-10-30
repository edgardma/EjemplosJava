package com.examen.java.se11.capitulo1.test16;

public class Aeroplane implements Flyable {

	@Override
	public void land() {
		System.out.println("Landing at " 
				+- Flyable.horizontalDegree() 
				+ " degrees."); // Linea n3
	}
	
	public static void main(String[] args) {
		new Aeroplane().fly();
		new Aeroplane().land();
		
		// Resultados:
		// Flying at 20 degrees.
		// Landing at -20 degrees.
		// Respuesta D
	}
}

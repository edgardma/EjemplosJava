package com.examen.java.se11.capitulo1.test16;

public interface Flyable {
	static int horizontalDegree() { // Linea 1
		return 20;
	}
	
	default void fly() {
		System.out.println("Flying at " 
			+ horizontalDegree() + " degrees."); // Linea n2
	}
	
	void land();
}

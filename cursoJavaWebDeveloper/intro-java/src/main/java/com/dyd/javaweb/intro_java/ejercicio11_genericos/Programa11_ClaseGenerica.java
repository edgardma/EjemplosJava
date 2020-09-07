package com.dyd.javaweb.intro_java.ejercicio11_genericos;

public class Programa11_ClaseGenerica {
	public static void main(String[] args) {
		ClaseGenerica<String> clase1 = new ClaseGenerica<String>("Java");
		System.out.println(clase1.getVariableInstancia());
		
		ClaseGenerica<Integer> clase2 = new ClaseGenerica<Integer>(1000);
		System.out.println(clase2.getVariableInstancia());
		
		GenericoMultiple<Integer, Integer> clase3 = new GenericoMultiple<Integer, Integer>();
		System.out.println(clase3.suma(10, 20));
		
		GenericoMultiple<Double, Double> clase4 = new GenericoMultiple<Double, Double>();
		System.out.println(clase4.suma(10.0, 20.0));
	}
}

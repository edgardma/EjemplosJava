package com.dyd.javaweb.intro_java.ejercicio11_genericos;

public class GenericoMultiple<N1 extends Number, N2 extends Number> {
	
	public double suma(N1 numero1, N2 numero2) {
		if (numero1 instanceof Integer) {
			return Double.sum((int) numero1, (int) numero2);
		}
		
		return Double.sum((double) numero1, (double) numero2);
	}
}

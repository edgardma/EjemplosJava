package com.dyd.javaweb.intro_java.ejercicio9_wrappers;

import java.util.Scanner;

public class Programa9 {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[5];
		
		numeros[0] = new Integer(7);
		numeros[1] = 9;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println();
		
		int valor = numeros[0];
		System.out.println(valor);
		
		try (Scanner scanner = new Scanner(System.in)) {
			String dato = scanner.next();
			
			double decimal = Double.parseDouble(dato);
			Double decimal2 = Double.valueOf(dato);
			
			System.out.println(decimal);
			System.out.println(decimal2);
			
			System.out.println();
			
			int entero = 10;
			double decimal3 = entero;
			System.out.println(decimal3);
			
			Integer enteroW = 10;
			Number numberW = entero;
			System.out.println(numberW.doubleValue());
			
			Double decimalW = (double) enteroW;
			System.out.println("Decimal");
			
			float floatPrimitivo = 1000f;
			long longPrimitivo = 100L;
			
		} catch(NumberFormatException e) {
			System.out.println("Ingrese un número válido");
		}
	}
}

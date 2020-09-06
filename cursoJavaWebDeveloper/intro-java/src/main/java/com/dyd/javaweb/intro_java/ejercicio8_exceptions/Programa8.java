package com.dyd.javaweb.intro_java.ejercicio8_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese un numerador: ");
			int numerador = scanner.nextInt();
			
			System.out.println("Ingrese un denominador: ");
			int denominador = scanner.nextInt();
			
			int resultado = division2(numerador, denominador);
			
			System.out.println("Resultado: " + resultado);
		} catch (InputMismatchException ime) {
			System.out.println("Ingrese un número válido");
		} catch (ArithmeticException ae) {
			System.out.println("Error aritmético");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Ocurrio un error: " + e.getMessage());
		} finally {
			System.out.println("Finally main");
			scanner.close();
		}
	}

	private static int division(int numerador, int denominador) {
		try {
			return numerador / denominador;
		} catch (ArithmeticException ae) {
			System.out.println("Error aritmético");
			return -1;
		} finally {
			System.out.println("Finally division");
		}
		
	}
	
	private static int division2(int numerador, int denominador) throws ArithmeticException {
		try {
			return numerador / denominador;
		} catch (ArithmeticException ae) {
			throw ae;
		} finally {
			System.out.println("Finally division2");
		}
		
	}
}

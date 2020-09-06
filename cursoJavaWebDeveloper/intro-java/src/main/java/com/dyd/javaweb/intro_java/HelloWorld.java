package com.dyd.javaweb.intro_java;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Bienvenido al curso!!!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nombre?");
		String nombre = scanner.nextLine();
		
		System.out.println("Hola: " + nombre);
		scanner.close();
	}

}

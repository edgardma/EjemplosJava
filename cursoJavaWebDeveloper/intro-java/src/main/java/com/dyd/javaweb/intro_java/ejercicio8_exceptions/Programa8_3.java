package com.dyd.javaweb.intro_java.ejercicio8_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa8_3 {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(new File("src/main/resources/alumnos.txt"))) {
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
		
	}

	public static void leerArchivo() {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("src/main/resources/alumnosa.txt"));
			
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Archivo no encontrado");
		} finally {
			if (scanner != null)
				scanner.close();
		}
	}
}

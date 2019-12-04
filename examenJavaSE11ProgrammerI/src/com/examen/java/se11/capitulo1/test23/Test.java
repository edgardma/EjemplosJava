package com.examen.java.se11.capitulo1.test23;

public class Test {
	static String msg; // Line 2
	
	public static void main(String[] args) {
		String msg; // Line 4
		
		if(args.length > 0) {
			msg = args[0]; // Line 6
		}
		//System.out.println(msg); // Line 8 -> Error en compilacion
	}
}

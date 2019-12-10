package com.examen.java.se11.capitulo1.test26;

public class Test {
	private static void test() throws Exception {
		throw new Exception();
	}
	
	public static void main(String[] args) {
		try {
			// test(); Error en compilacion
		} finally {
			System.out.println("GAME ON");
		}
	}
}

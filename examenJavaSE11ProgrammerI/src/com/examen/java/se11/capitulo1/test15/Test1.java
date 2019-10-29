package com.examen.java.se11.capitulo1.test15;

interface Operation {
	int operate(int x, int y);
}


public class Test1 {
	public static void main(String[] args) {
		int x = 20;
		int y = 20;
		//Operation o1 = (x, y) -> x * y; // Error al compilar
		//System.out.println(o1.operate(5, 10));
	}
	
}

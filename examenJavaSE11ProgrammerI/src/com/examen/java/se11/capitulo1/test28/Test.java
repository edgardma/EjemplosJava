package com.examen.java.se11.capitulo1.test28;

public class Test {
	public static void main(String[] args) {
		for (int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
			System.out.println(x + y + z); // 33
		}
	}
}

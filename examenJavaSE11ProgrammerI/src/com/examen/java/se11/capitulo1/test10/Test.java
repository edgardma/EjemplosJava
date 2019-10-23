package com.examen.java.se11.capitulo1.test10;

public class Test {
	public static void main(String[] args) {
		 int x = 1;
		 while (checkAndIncrement(x)) {
			 System.out.println(x); // INFINITE LOOP
		 }
	}

	private static boolean checkAndIncrement(int x) {
		if (x < 5) {
			x++;
			return true;
		} else {
			return false;
		}
	}
}

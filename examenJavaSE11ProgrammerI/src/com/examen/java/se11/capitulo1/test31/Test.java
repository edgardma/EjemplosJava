package com.examen.java.se11.capitulo1.test31;

public class Test {
	public static void main(String[] args) {
		boolean flag1 = "Java" == "Java".replace('J', 'J'); // Line n1
		boolean flag2 = "Java" == "Java".replace("J", "J"); // Line n2
		System.out.println(flag1 && flag2); // false
	}
}

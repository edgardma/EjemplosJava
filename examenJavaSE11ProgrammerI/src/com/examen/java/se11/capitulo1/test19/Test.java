package com.examen.java.se11.capitulo1.test19;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Dream BIG");
		String s1 = sb.toString();
		String s2 = sb.toString();
		
		System.out.println(s1 == s2); // false
	}
}

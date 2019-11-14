package com.examen.java.se11.capitulo1.test17;

public class Test {
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"}; // Line n1
		arr[0] = arr[1]; // Line 2
		arr[1] = "E"; // Line 3
		
		for(String s: arr) {
			System.out.println(s + " ");
		}
	}
}

package com.examen.java.se11.capitulo1.test2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<String> list;
		list = new ArrayList<>(); // Linea n1
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		list.addAll(list.subList(0, 4)); // Linea n2
		System.out.println(list); // Respuesta: [A, E, I, O, U, A, E, I, O]
	}
}

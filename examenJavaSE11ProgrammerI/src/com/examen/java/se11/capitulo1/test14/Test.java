package com.examen.java.se11.capitulo1.test14;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		
		list.add(0, 'E');
		list.add('X');
		list.add(1, 'P');
		list.add(2, 'O');
		
		if (list.contains('O')) {
			list.remove('O'); // Error ejecucion
		}
		
		for (char ch : list) {
			System.out.print(ch);
		}
	}
}

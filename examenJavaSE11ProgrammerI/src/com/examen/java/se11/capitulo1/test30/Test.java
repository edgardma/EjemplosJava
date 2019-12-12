package com.examen.java.se11.capitulo1.test30;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(15);
		list.add(25);
		list.add(15);
		list.add(25);
		
		list.remove(Integer.valueOf(15)); // [25, 15, 25]
		
		System.out.println(list);
	}
}

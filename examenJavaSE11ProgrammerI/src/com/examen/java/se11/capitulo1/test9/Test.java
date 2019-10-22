package com.examen.java.se11.capitulo1.test9;

import java.util.List;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		List<String> words = List.of("A", "an", "the", 
				"when", "what", "Where", "whether");
		
		processStringArray(words, p -> true); // p -> true // p -> !!!!true // p -> p.length() >= 1 // (var p)->p.length() < 100
	}

	private static void processStringArray(List<String> list, Predicate<String> predicate) {
		for(String str : list) {
			if (predicate.test(str)) {
				System.out.println(str);
			}
		}
	}
}

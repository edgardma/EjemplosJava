package com.examen.java.se11.capitulo1.test12;

interface Document {
	default String getType() {
		return "TEXT";
	}
}

interface WordDocument extends Document {
	String getType();
}

class Word implements WordDocument { // Respuesta C

	@Override
	public String getType() {
		return null;
	}	
}

public class Test {
	public static void main(String[] args) {
		Document doc = new Word(); // Line 1
		
		System.out.println(doc.getType()); // Line 2
	}
}

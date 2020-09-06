package com.dyd.javaweb.intro_java.ejercicio10_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa10_Utils {
	public static void main(String[] args) {
		String[] colores = {"negro", "amarillo", "verde", "azul", "violeta"};
		System.out.println(colores);
		
		System.out.println("================");
		List<String> lista = Arrays.asList(colores);
		
		System.out.println("Lista original: " + lista);
		
		System.out.println("================");
		Collections.sort(lista);
		System.out.println("Lista modificada: " + lista);
		
		System.out.println("================");
		Collections.reverse(lista);
		System.out.println("Lista invertida: " + lista);
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("José"));
		personas.add(new Persona("Luis"));
		personas.add(new Persona("Gabriel"));
		personas.add(new Persona("Rodrigo"));
		personas.add(new Persona("Brayan"));
		System.out.println("================");
		System.out.println(personas);
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona persona1, Persona persona2) {
				return persona1.nombre.compareTo(persona2.nombre);
			}
		});
		System.out.println("================");
		System.out.println(personas);
		System.out.println("================");
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
}

class Persona implements Comparator<Persona> {
	String nombre;
	
	Persona(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "nombre: " + this.nombre;
	}

	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.nombre.compareTo(persona2.nombre);
	}
}
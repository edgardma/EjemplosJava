package com.dyd.javaweb.intro_java.ejercicio11_genericos;

import java.util.ArrayList;
import java.util.List;

public class Programa11 {
	public static void main(String[] args) {
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(new Estudiante("Rodrigo"));
		estudiantes.add(new Estudiante("Jose"));
		estudiantes.add(new Estudiante("Brian"));
		estudiantes.add(new Estudiante("Gabriel"));
		
		imprimirConWildcardSuper(estudiantes);
		
		List<Docente> docentes = new ArrayList<Docente>();
		docentes.add(new Docente("Diego"));
		docentes.add(new Docente("Jaime"));
		
		imprimirConWildcardExtends(docentes);
		
		System.out.println("=============");
		Estudiante e1 = new Estudiante("Andres");
		imprimir(e1);
		
		Persona p1 = new Persona("Juan");
		imprimir(p1);
	}

	private static <T> void imprimir(List<T> lista) {
		for (T elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	private static void imprimirConWildcardExtends(List<? extends Persona> lista) {
		for (Persona elemento : lista) {
			System.out.println(elemento.nombre);
		}
	}
	
	private static void imprimirConWildcardSuper(List<? super Estudiante> lista) {
		for (Object elemento : lista) {
			System.out.println(((Persona) elemento).nombre);
		}
	}
	
	private static <T> void imprimir(T elemento) {
		System.out.println(elemento);
	}
}

class Persona {
	String nombre;
	
	Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
}

class Estudiante extends Persona {
	Estudiante(String nombre) {
		super(nombre);
	}

	int nota;

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + "]";
	}
}

class Docente extends Persona {
	Docente(String nombre) {
		super(nombre);
	}

	String curso;

	@Override
	public String toString() {
		return "Docente [curso=" + curso + ", nombre=" + nombre + "]";
	}
}

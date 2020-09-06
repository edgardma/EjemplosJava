package com.dyd.javaweb.intro_java.ejercicio10_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.dyd.javaweb.intro_java.ejercicio8_exceptions.CuentaAhorro;

public class Programa10_intro {
	public static void main(String[] args) {
		//usoDeArrayList();
		
		//String[] colores = {"rojo", "amarillo", "morado", "celeste"};
		//List<String> lista = Arrays.asList(colores);
		
		//linkedList();
		
		int cantidad = 10000;
		long inicio = 0;
		long fin = 0;
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		// Agregar
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.add("Elemento: " + i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Agregar Arraylist: " + (fin - inicio) + " ms");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			linkedList.add("Elemento: " + i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Agregar LinkedList: " + (fin - inicio) + " ms");
		
		// Obtener
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.get(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Obtener Arraylist: " + (fin - inicio) + " ms");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			linkedList.get(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Obtener LinkedList: " + (fin - inicio) + " ms");
		
		// Modificar
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.set(i, "Modificado " + i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Modificar Arraylist: " + (fin - inicio) + " ms");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			linkedList.set(i, "Modificado " + i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Modificar LinkedList: " + (fin - inicio) + " ms");
		
		// Eliminar
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.remove(0);
		}
		fin = System.currentTimeMillis();
		System.out.println("Eliminar Arraylist: " + (fin - inicio) + " ms");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < linkedList.size(); i++) {
			linkedList.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Eliminar LinkedList: " + (fin - inicio) + " ms");
	}

	private static void linkedList() {
		LinkedList<String> lista = new LinkedList<>();
		lista.add("rojo");
		lista.add("magenta");
		lista.add("ladrillo");
		
		lista.addFirst("celeste");
		
		imprimir(lista);
	}

	private static void usoDeArrayList() {
		//ArrayList nombres = new ArrayList();
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Diego");
		nombres.add("123"); //(123);
		nombres.add(Boolean.toString(true)); //(true);
		
		System.out.println("Iteración por for each");
		imprimir(nombres);
		
		System.out.println("Uso de Iterator");
		Iterator<String> iterator = nombres.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<CuentaAhorro> cuentas = new ArrayList<>();
		cuentas.add(new CuentaAhorro("123456", "Fernando"));
		cuentas.add(new CuentaAhorro("abcdef", "Andres"));
		cuentas.add(new CuentaAhorro("1234-xyz", "Gabriel"));
		
		System.out.println("Cuentas: ");
		for (CuentaAhorro cuentaAhorro : cuentas) {
			System.out.println(cuentaAhorro);
		}
	}
	
	private static void imprimir(List<String> lista) {
		for (String color : lista) {
			System.out.println(color);
		}
	}
}

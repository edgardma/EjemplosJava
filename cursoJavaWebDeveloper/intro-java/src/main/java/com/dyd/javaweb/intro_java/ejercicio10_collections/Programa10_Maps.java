package com.dyd.javaweb.intro_java.ejercicio10_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Programa10_Maps {
	public static void main(String[] args) {
		Map<String, String> mapa = new HashMap<>();
		
		mapa.put("CO", "Colombia");
		mapa.put("PE", "Perú");
		mapa.put("CH", "Chile");
		mapa.put("US", "Estados Unidos");
		mapa.put("EC", "Ecuador");
		mapa.put(null, "Narnia");
		
		System.out.println("Impresion de llaves");
		
		for (String llave : mapa.keySet()) {
			System.out.println(llave);
		}
		
		System.out.println("Impresion por valores");
		for (String llave : mapa.values()) {
			System.out.println(llave);
		}
		
		System.out.println("Impresion por EntrySet");
		for (Entry<String, String> entry : mapa.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
		System.out.println(mapa.get("CO"));
		System.out.println(mapa.get("BR"));
		System.out.println(mapa.get(null));
		
		mapa.putIfAbsent("EC", "Quito");
		mapa.put(null, "Dark");
		
		System.out.println("Impresion por EntrySet");
		for (Entry<String, String> entry : mapa.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
	}
}

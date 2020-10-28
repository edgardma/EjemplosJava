package pe.com.dyd.javaweb.funcional._01_lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa01 {
	public static void main(String[] args) {
		comparatorInicial();
	}
	
	private static void comparatorConObjetos() {
		
	}

	private static void comparatorInicial() {
		String[] colores = {"negro", "amarillo", "verde", "azul", "violeta", "rojo"};
		List<String> lista = Arrays.asList(colores);
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Lista ascendete");
		System.out.println(lista);
		
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println("Lista descendente");
		System.out.println(lista);
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Collections.sort(lista, comparator);
		System.out.println("Lista con comparador");
		System.out.println(lista);
	}
}

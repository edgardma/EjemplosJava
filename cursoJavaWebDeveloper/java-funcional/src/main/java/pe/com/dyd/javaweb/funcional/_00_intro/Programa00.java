package pe.com.dyd.javaweb.funcional._00_intro;

public class Programa00 {
	
	private Integer sumatoria = 0;
	
	public static void main(String[] args) {
		Programa00 programa = new Programa00();
		System.out.println(programa.suma2(3, 5));
		System.out.println(programa.suma2(3, 5));
		System.out.println(programa.suma2(3, 5));
		System.out.println(programa.suma2(3, 5));
		System.out.println(programa.suma2(3, 5));
	}
	
	// Este es una funcion pura, es decir, recibiendo los mismos valores de parametros
	// se obtendrá el mismo resultado, "n" veces
	public int suma(int a, int b) {
		return a + b;
	}
	
	// Funcion Impura: Es cuando tiene un resultado diferente para los mismos parametros
	public int suma2(int a, int b) {
		sumatoria += suma(a, b);
		return sumatoria;
	}
	
	
}

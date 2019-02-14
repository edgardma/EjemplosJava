package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta07 {
	public static void main(String[] args ) {
		int[] x = {10, 20, 30, 40, 50};
		x[2] = x[4];
		x[4] = 60;
		for(int n1 : x) {
			System.out.print(n1 + ","); // Resultado: 10:20:30:40:50:
		}
	}
}

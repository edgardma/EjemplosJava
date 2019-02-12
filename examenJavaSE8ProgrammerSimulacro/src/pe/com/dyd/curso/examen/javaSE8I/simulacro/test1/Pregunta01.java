package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta01 {
	int i, j;
	
	public Pregunta01(int i, int j) {
		initialize(i, j);
	}

	private void initialize(int i2, int j2) {
		this.i = i + i;
		this.j = j + j;
	}
	
	public static void main(String[] args) {
		int i = 3, j = 5;
		Pregunta01 t = new Pregunta01(i, j);
		System.out.println(i + "..." + j); // Resultado: 3...5
	}
}

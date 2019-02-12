package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta09 {
	public static void main(String[] args) {
		int i = 100;
		float f = 100.100f;
		double d = 123;
		
		//i = d; // No compila
		d = f;
		f = i;
		//i = f; // No compila
		//f = d; // No compila
		d = i;
		
		/*
		i = (int)f;
		f = i;
		d = f;
		d = i;
		*/
	}
}

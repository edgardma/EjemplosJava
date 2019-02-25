package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta27 {
	private char ch;
	
	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = ch1;
		ch2 = 'e';
		
		Pregunta27 obj1 = new Pregunta27();
		Pregunta27 obj2 = new Pregunta27();
		obj1.ch = 'i';
		obj2.ch = 'o';
		
		System.out.println(ch1 + ":" + ch2);
		System.out.println(obj1.ch + ":" + obj2.ch);
		
		/* Resultado:
		 * a:e
		 * i:o
		 */
		/*
		double d = 203.22;
		float f = d;
		*/
	}
}

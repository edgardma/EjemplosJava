package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta08 {
	public static void main(String[] args) {
		String[] s = new String[2];
		int i = 0;
		for (String s1 : s) {
			s[i].concat("Element " + i);
			i++;
		}
		for (i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}
}

/*Resultado:
 * Exception in thread "main" java.lang.NullPointerException
	at pe.com.dyd.curso.examen.javaSE8I.simulacro.test1.Pregunta08.main(Pregunta08.java:8)
 * */

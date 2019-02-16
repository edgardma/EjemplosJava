package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta23 {
	public static int x = 100;
	public int y = 200;
	
	public String toString() {
		return y + ":" + x;
	}
	
	public static void main(String[] args) {
		Pregunta23 t1 = new Pregunta23();
		t1.y = 300;
		System.out.println(t1);
		Pregunta23 t2 = new Pregunta23();
		t2.x = 300;
		System.out.println(t2);
	}
}

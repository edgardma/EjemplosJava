package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta22 {
	int x = 10;
	static int y = 20;
	public static void main(String[] args) {
		Pregunta22 t1 = new Pregunta22();
		Pregunta22 t2 = new Pregunta22();
		t1.x = 100;
		t1.y = 200;
		t2.x = 300;
		t2.y = 400;
		System.out.println(t1.x + ".." + t1.y + ".." + t2.x + ".." + t2.y + "..");
	}
}

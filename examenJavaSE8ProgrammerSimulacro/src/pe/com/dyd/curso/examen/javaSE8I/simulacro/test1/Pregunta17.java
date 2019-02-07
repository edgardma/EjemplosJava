package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta17 {
	public void m1(int i, int j) {
		i = i + 10;
		j = j + 10;
		System.out.println("Inside Method:" + i + ".." + j);
	}
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		Pregunta17 t = new Pregunta17();
		t.m1(x,  y);
		System.out.println("After Completing Method:" + x + ".." + y);
	}
}

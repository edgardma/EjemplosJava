package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

class Demo {
	int x;
	int y;
}

public class Pregunta02 {
	public void m1(Demo d) {
		d.x = 888;
		d.y = 999;
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.x = 10;
		d1.y = 20;
		Pregunta02 t = new Pregunta02();
		t.m1(d1);
		System.out.println(d1.x + "..." + d1.y); // Resultado: 888...999
	}
}

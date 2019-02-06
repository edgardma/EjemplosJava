package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta13 {
	int x;
	int y;
	public void doStuff(int x, int y) {
		this.x = x;
		y = this.y;
	}
	public void print() {
		System.out.print(x + ":" + y +":");
	}
	public static void main(String[] args) {
		Pregunta13 t1 = new Pregunta13();
		t1.x = 100;
		t1.y = 200;
		
		Pregunta13 t2 = new Pregunta13();
		t2.doStuff(t1.x, t1.y);
		t1.print();
		t2.print();
	}
}

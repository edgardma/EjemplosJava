package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta18 {
	static int count = 0;
	int i = 0;
	public void modify() {
		while (i < 5 ) {
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		Pregunta18 t1 = new Pregunta18();
		Pregunta18 t2 = new Pregunta18();
		t1.modify();
		t2.modify();
		System.out.println(t1.count + ".." + t2.count);
	}
}

package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

class Demo24 {
	int ns;
	static int s;
	
	Demo24(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}
	
	void display() {
		System.out.println("ns = " + ns + "   s = " + s);
	}
}

public class Pregunta24 {
	public static void main(String[] args) {
		Demo24 d1 = new Demo24(50);
		Demo24 d2 = new Demo24(125);
		Demo24 d3 = new Demo24(100);
		
		d1.display();
		d2.display();
		d3.display();
	}
}

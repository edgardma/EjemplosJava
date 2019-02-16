package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta10 {
	int count;
	public static void display() {
		//count++; // Line-1 - Error por que debe ser una variable estática
		//System.out.println("Welcome Visit Count: " + count); // Line-2 - Error por que debe ser una variable estática
	}
	public static void main(String[] args) {
		Pregunta10.display();
		Pregunta10.display();
	}
}

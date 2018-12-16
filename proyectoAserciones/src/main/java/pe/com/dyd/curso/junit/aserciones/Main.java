package pe.com.dyd.curso.junit.aserciones;

public class Main {

	public static void main(String[] args) {
		// Primitivos
		int a = 5;
		int b= 5;
		
		System.out.println("Primitivos -> " + (a == b)); // true o false
		
		// Objetos
		Persona personaA = new Persona("Paco", "Perez");
		Persona personaB = new Persona("Paco", "Perez");
		
		System.out.println("Objetos -> " + (personaA == personaB)); // siempre false
		System.out.println("Objetos -> " + (personaA.equals(personaB))); // es true si se sobreescribe 'equals'
	}

}

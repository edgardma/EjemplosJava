package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

class Student2 {
	String name;
	public Student2(String name) {
		this.name = name;
	}
}

public class Pregunta16 {
	public static void main(String[] args) {
		Student2[] students = new Student2[3];
		//students[0] = new Student23("x"); // Esta linea no existe, pero con esto no sale error
		students[1] = new Student2("Durga");
		students[2] = new Student2("Ravi");
		for (Student2 s : students) {
			System.out.println(s.name); // Sale error : NullPointerException
		}
	}
}

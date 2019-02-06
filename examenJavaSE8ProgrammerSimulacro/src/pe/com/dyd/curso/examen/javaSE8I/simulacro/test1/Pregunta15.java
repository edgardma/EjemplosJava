package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

class Student {
	int rollno;
	String name;
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class Pregunta15 {
	public static void main(String[] args) {
		Student[] students = {
				new Student(101, "Durga"),
				new Student(102, "Ravi"),
				new Student(103, "Shiva"),
				new Student(104, "Pavan")
		};
		System.out.println(students);
		System.out.println(students[2]);
		System.out.println(students[2].rollno);
	}
}

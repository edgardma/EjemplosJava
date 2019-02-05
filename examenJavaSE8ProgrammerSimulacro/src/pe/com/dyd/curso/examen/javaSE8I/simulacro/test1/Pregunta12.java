package pe.com.dyd.curso.examen.javaSE8I.simulacro.test1;

public class Pregunta12 {
	String myStr = "7777";
	public void doStuff(String s) {
		int myNum = 0;
		try {
			String myStr = s;
			myNum = Integer.parseInt(myStr);
		} catch(NumberFormatException ex) {
			System.out.println("Error");
		}
		System.out.println("myStr: " + myStr + " , myNum: " + myNum);
	}
	public static void main(String[] args) {
		Pregunta12 t = new Pregunta12();
		t.doStuff("9999");
	}
}

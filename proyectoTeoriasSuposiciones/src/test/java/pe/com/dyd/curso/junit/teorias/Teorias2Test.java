package pe.com.dyd.curso.junit.teorias;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Teorias2Test {
	
	@DataPoints
	public static String[] letras = {"a", "b", "c"};
	
	@DataPoint
	public static Integer num = 1;
	
	@DataPoint
	public static Integer num2 = 2;
	
	@Theory
	public void testTeorias(String a, String b, String c, Integer num1, Integer num2) {
		System.out.println("Combinacion: " + a + b + c + num1 + num2);
	}
}

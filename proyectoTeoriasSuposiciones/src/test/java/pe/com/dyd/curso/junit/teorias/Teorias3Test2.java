package pe.com.dyd.curso.junit.teorias;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Teorias3Test2 {
	
	@DataPoints
	public static int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	
	@Theory
	public void testTeorias(int num1, int num2) {
		System.out.println("Combinacion: " + num1 + num2 + "--" + num2 + num1);
		Assert.assertEquals(num1 + num2, num2 + num1);
	}
}

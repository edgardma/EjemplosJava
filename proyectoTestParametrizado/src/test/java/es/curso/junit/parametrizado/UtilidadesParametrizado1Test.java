package es.curso.junit.parametrizado;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UtilidadesParametrizado1Test {
	
	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] {
			{1, 2}, {3, 5}, {0, 4}, {8, 4}, {1, 3}
		});
	}
	
	private int v1;
	private int v2;
	private Utilidades utils = new Utilidades();
	
	public UtilidadesParametrizado1Test(int valor1, int valor2) {
		v1 = valor1;
		v2 = valor2;
	}
	
	@Test
	public void testSuma() {
		System.out.println("Los parámetros son: v1= " + v1 + " v2= " + v2);
		int resultado = utils.sumaNumeros(v1, v2);
		Assert.assertEquals(v1 + v2, resultado);
	}
}

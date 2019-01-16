package es.curso.junit.parametrizado;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UtilidadesParametrizado2Test {

	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] {
			{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}
		});
	}
	
	@Parameter(0)
	public String valor1; 
	
	@Parameter(1)
	public String valor2; 
	
	@Parameter(2)
	public String valor3; 
	
	private Utilidades utils = new Utilidades();
	
	@Test
	public void testConcatenar() {
		System.out.println("Ejecución: v1= " + valor1 + " v2= " + valor2 + " v3= " + valor3);
		
		Assert.assertEquals(valor1 + " " + valor2 + " " + valor3, utils.concatenar(valor1, valor2, valor3));
	}
}

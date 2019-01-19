package es.curso.junit.parametrizado;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class UtilidadesLibreriaTest {
	
	@Test
	@Parameters({"AAA,1", "BBB,2"})
	public void parametrosConAnotaciones(String cadena, Integer numero) {
		System.out.println("El valor de la cadena es:" + cadena);
		System.out.println("El valor de la numero es:" + numero);
	}

}

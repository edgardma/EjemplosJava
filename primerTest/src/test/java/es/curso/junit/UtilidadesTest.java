package es.curso.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConcatenar() {
		// Instanciar la clase
		Utilidades utilidades = new Utilidades();
		
		// Ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", "Mundo");
		
		//Validaciones
		Assert.assertEquals("Las cadenas son diferentes", "Hola Mundo", resultado);
	}
	
	@Test
	public void testConcatenarFallo() {
		// Instanciar la clase
		Utilidades utilidades = new Utilidades();
		
		// Ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", "Mundo");
		
		//Validaciones
		Assert.assertEquals("Las cadenas son diferentes", "Hola Mundo", resultado);
	}
	
	@Test
	public void testConcatenarError() {
		// Instanciar la clase
		Utilidades utilidades = new Utilidades();
		
		// Ejecutar el metodo a probar
		String resultado = utilidades.concatenar(null, "Mundo");
		
		//Validaciones
		Assert.assertEquals("Las cadenas son diferentes", null, resultado);
	}
}

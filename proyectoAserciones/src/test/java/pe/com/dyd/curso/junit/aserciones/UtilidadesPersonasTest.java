package pe.com.dyd.curso.junit.aserciones;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilidadesPersonasTest {
	
	private UtilidadesPersonas utils;

	@Before
	public void setUp() throws Exception {
		utils = new UtilidadesPersonas();
	}

	@Test
	public void testGetCarlos() throws Exception {
		//given
		
		//when
		Persona carlos = utils.getCarlos();
		
		//then
		assertEquals("Carlos", carlos.getNombre());
		assertEquals("Romero", carlos.getApellido());
	}

	@Test
	public void testGetJuan() throws Exception {
		//given
		
		//when
		Persona juan = utils.getJuan();
		
		//then
		assertEquals("Juan", juan.getNombre());
		assertEquals("Lopez", juan.getApellido());
	}
	
	@Test
	public void testPersonasDiferentes() {
		Persona carlos = utils.getCarlos();
		Persona juan = utils.getJuan();
		
		Assert.assertNotEquals(juan, carlos);
	}
}

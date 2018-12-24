package pe.com.dyd.curso.junit.aserciones;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesNullTest {

	private UtilidadesNull utils;
	
	@Before
	public void setUp() throws Exception {
		utils = new UtilidadesNull();
	}

	@Test
	public void testDamePersona() throws Exception {
		// given
		
		// when
		Persona personaA = utils.damePersona("Juan");
		Persona personaNull = utils.damePersona("Pepe");
		
		// then
		assertNull(personaNull);
		assertNotNull(personaA);
	}

}

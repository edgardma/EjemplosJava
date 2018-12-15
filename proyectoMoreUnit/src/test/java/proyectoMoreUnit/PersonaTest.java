package proyectoMoreUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
	
	private Persona persona;

	@Before
	public void setUp() throws Exception {
		persona = new Persona("Juan", "Martinez");
	}

	@Test
	public void testGetNombre() throws Exception {
		//given
		
		//when
		
		//then
		Assert.assertTrue(persona.getNombre().equals("Juan"));
	}

}

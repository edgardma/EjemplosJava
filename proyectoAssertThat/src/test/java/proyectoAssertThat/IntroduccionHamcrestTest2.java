package proyectoAssertThat;

import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntroduccionHamcrestTest2 {
	
	@Before
	public void setUp() {
	}

	@Test
	public void ejemplosInicialesHamcrest() {
		String cadena = "HolaMundo";
		
		// Comparativa
		Assert.assertEquals("HolaMundo", cadena);
		Assert.assertThat(cadena, is("HolaMundo"));
	}
}

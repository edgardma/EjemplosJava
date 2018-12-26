package pe.com.dyd.curso.junit.aserciones;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesSameTest {
	
	private UtilidadesSame utils;

	@Before
	public void setUp() throws Exception {
		utils = new UtilidadesSame();
	}

	@Test
	public void testSame() throws Exception {
		// given
		Persona p = new Persona("Juan", "Lopez");
		
		// when
		Persona resultado = utils.devuelveObjeto(p);
		
		//then
		Assert.assertSame(p, resultado);
		Assert.assertEquals(p, resultado);
	}
	
	@Test
	public void testNotSame() throws Exception {
		// given
		Persona p = new Persona("Marco", "Rodriguez");
		
		// when
		Persona resultado = utils.devuelveObjeto(p);
		
		//then
		Assert.assertNotSame(p, resultado);
		Assert.assertNotEquals(p, resultado);
	}

	@Test
	public void testNotSame2() throws Exception {
		// given
		Persona p = new Persona("Paco", "Martinez");
		
		// when
		Persona resultado = utils.devuelveObjeto(p);
		
		//then
		Assert.assertNotSame(p, resultado);
		Assert.assertEquals(p, resultado);
	}
}

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MetodosManuales {
	@BeforeClass
	public static void antesTestClass() {
		System.out.println("Antes de todos los test \n");
	}
	
	@AfterClass
	public static void despuesTestClass() {
		System.out.println("Despues de todos los test \n");
	}
	
	@Before
	public void antesTest() {
		System.out.println("Antes de cada test");
	}
	
	@After
	public void despuesTest() {
		System.out.println("Despues de cada test \n");
	}
	
	@Test
	public void primerTest() {
		System.out.println("Primer test");
	}
	
	@Test
	public void segundoTest() {
		System.out.println("Segundo test");
	}
}

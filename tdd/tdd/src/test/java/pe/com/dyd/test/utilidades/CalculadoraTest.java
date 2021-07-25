package pe.com.dyd.test.utilidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pe.com.dyd.utilidades.Calculadora;

class CalculadoraTest {

	@Test
	@DisplayName("Suma de dos números")
	void testSuma() {
		
		//arange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//act (ejecutar)
		double suma = calculadora.sumar(2,  2);
		
		//assert (confirmacion)
		assertEquals(4, suma);
	}
	
	@Test
	@DisplayName("Resta de dos números")
	void testResta() {
		
		//arange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//act (ejecutar)
		double resta = calculadora.restar(2,  2);
		
		//assert (confirmacion)
		assertEquals(0, resta);
	}
	
	@Test
	@DisplayName("Multiplicacion de dos números")
	void testMultiplicar() {
		
		//arange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//act (ejecutar)
		double multiplica = calculadora.multiplicar(2,  3);
		
		//assert (confirmacion)
		assertEquals(6, multiplica);
	}
	
	@Test
	@DisplayName("Dvidir de dos números")
	void testDividir() {
		
		//arange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//act (ejecutar)
		double divide = calculadora.dividir(4,  2);
		
		//assert (confirmacion)
		assertEquals(2, divide);
	}

}

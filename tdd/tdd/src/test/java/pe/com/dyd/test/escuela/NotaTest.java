package pe.com.dyd.test.escuela;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import pe.com.dyd.escuela.Nota;

class NotaTest {

	@Test
	void testMismaAsignaturaNota() {
		// arrange
		Nota nota1 = new Nota(8, "Lengua");
		Nota nota2 = new Nota(7, "Lengua");
		Nota nota3 = new Nota(8, "Matematica");
		
		// act
		boolean esMisma = nota1.esMismaAsignatura(nota2);
		boolean esDistinta = nota1.esMismaAsignatura(nota3);
		
		// assert
		assertTrue(esMisma);
		assertFalse(esDistinta);
	}
	
	@Test
	void testIgualdadNotas() {
		// arrange
		Nota nota1 = new Nota(8, "Lengua");
		Nota nota2 = new Nota(8, "Lengua");
		
		// act
		boolean iguales = nota1.equals(nota2);
		
		// assert
		assertTrue(iguales);
	}
	
	@Test
	void testNoIgualdadNotas() {
		// arrange
		Nota nota1 = new Nota(8, "Lengua");
		Nota nota3 = new Nota(8, "Matematica");
		
		// act
		boolean noIguales = nota1.equals(nota3);
		
		// assert
		assertFalse(noIguales);
	}
	
	@Test
	void testNotaEsMayorQueOtra() {
		// arrange
		Nota nota1 = new Nota(5, "Lengua");
		Nota nota3 = new Nota(8, "Lengua");
		
		// act
		boolean esMayor = nota3.esMayor(nota1);
		
		// assert
		assertTrue(esMayor);
	}

	@Test
	void testNotaNoEsComparableConOtra() {
		// arrange
		Nota nota1 = new Nota(5, "Lengua");
		Nota nota3 = new Nota(8, "Matematica");
		
		// act
		
		
		// assert
		assertThrows(RuntimeException.class, ()->nota1.esMayor(nota3));
	}
	
}

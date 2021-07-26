package pe.com.dyd.test.escuela;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.com.dyd.escuela.Nota;
import pe.com.dyd.escuela.Nota.Tipo;

class NotaTest2 {
	
	Nota nota1 = null;
	Nota nota2 = null;
	Nota nota3 = null;
	Nota nota4 = null;
	Nota nota5 = null;
	Nota nota6 = null;
	
	@BeforeEach
	public void setUp() {
		// arrange
		// Compartir un testFixture entre varias
		nota1 = new Nota(8, "Lengua");
		nota2 = new Nota(8, "Lengua");
		nota3 = new Nota(9, "Matematicas");
		nota4 = new Nota(7, "Matematicas");
		nota5 = new Nota(10, "Lengua");
		nota6 = new Nota(6, "Lengua");
	}

	@Test
	void testMismaAsignaturaNota() {
		// act
		boolean esMisma = nota1.esMismaAsignatura(nota2);
		boolean esDistinta = nota1.esMismaAsignatura(nota3);
		
		// assert
		assertTrue(esMisma);
		assertFalse(esDistinta);
	}
	
	@Test
	void testIgualdadNotas() {
		// act
		boolean iguales = nota1.equals(nota2);
		
		// assert
		assertTrue(iguales);
	}
	
	@Test
	void testNoIgualdadNotas() {
		// act
		boolean noIguales = nota1.equals(nota3);
		
		// assert
		assertFalse(noIguales);
	}
	
	@Test
	void testNotaEsMayorQueOtra() {
		// act
		boolean esMayor = nota5.esMayor(nota1);
		
		// assert
		assertTrue(esMayor);
	}

	@Test
	void testNotaNoEsComparableConOtra() {
		// act
		
		
		// assert
		assertThrows(RuntimeException.class, ()->nota1.esMayor(nota3));
	}
	
	
	@Test
	void testNotaTipoBien() {
		Tipo miTipoNota = nota6.getTipo();
		
		assertEquals(Tipo.BIEN, miTipoNota);
	}
	
	@Test
	void testNotaTipoNotable() {
		Tipo miTipoNota = nota4.getTipo();
		
		assertEquals(Tipo.NOTABLE, miTipoNota);
	}
}

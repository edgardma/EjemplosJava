package test;

import org.junit.Test;

import pe.com.empresa.reconocimiento.Proceso;

public class ProcesoTest {
	
	@Test
	public void testConcatenar( ) {
		Proceso.procesarImagenes("E:\\lib\\opencv-320\\cascades\\haarcascade_frontalface_alt.xml", 
				"E:\\Codigo\\Java\\librerias\\imagenes\\cara1.jpg");
	}

}

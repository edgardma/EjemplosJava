package pe.com.empresa.reconocimiento;

import java.util.List;

public class Proceso {
	private static final String RUTA_ARCHIVO_DETECTOR_ROSTROS = "E:\\lib\\opencv-320\\cascades\\haarcascade_frontalface_alt.xml";
	
	public static void procesarImagenes(String rutaImagen) {
		procesarImagenes(RUTA_ARCHIVO_DETECTOR_ROSTROS, rutaImagen);
	}
	
	public static void procesarImagenes(String rutaDetectorRostros,
			String rutaImagen) {
		try {
			Imagen imgagen = new Imagen(rutaDetectorRostros);
			List<Rostro> rostros = imgagen.reconocerRostros(rutaImagen);
			int i = 0;
			for (Rostro rostro : rostros) {
				i++;
				System.out.println("Rostro No.: " + i);
				System.out.println("X: " + rostro.getX());
				System.out.println("Y: " + rostro.getY());
				System.out.println("Height: " + rostro.getHeight());
				System.out.println("Width: " + rostro.getWidth());
			}
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}

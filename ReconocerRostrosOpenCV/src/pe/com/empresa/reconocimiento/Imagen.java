package pe.com.empresa.reconocimiento;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.objdetect.CascadeClassifier;

public class Imagen {
	private String rutaDetectorRostros = "";
	
	public Imagen(String rutaXml) {
		rutaDetectorRostros = rutaXml;
	}
	
	public List<Rostro> reconocerRostros(String rutaImagen) {
		List<Rostro> rostros = new ArrayList<Rostro>();
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		CascadeClassifier detectorRostros = 
		        new CascadeClassifier(rutaDetectorRostros); 

		Mat imagen = Imgcodecs.imread(rutaImagen);

		MatOfRect vectorRostros = new MatOfRect();
		detectorRostros.detectMultiScale(imagen, vectorRostros);

		for (Rect rectRostro : vectorRostros.toArray()) {
			rostros.add(new Rostro(rectRostro.x, rectRostro.y, rectRostro.width, rectRostro.height));
		}
		
		return rostros;
	}
}

package pe.com.dyd.example.datenull;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = null;
		System.out.println("Prueba: " + (date == null ? "--" : date));
		
		date = new Date();
		System.out.println("Prueba: " + (date == null ? "--" : date));

	}
}

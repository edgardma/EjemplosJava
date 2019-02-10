package pe.com.dyd.patrones.ejemplos.flighweight;

import java.util.HashMap;
import java.util.Map;

public class ContenedorMacLigero {
	private static Map<String, MacLigero> macLigeros = new HashMap<String, MacLigero>();
	
	public static MacLigero getMacLigero(int ram, int disco) {
		String clave = ram + ":" + disco;
		System.out.println(clave);
		if (!macLigeros.containsKey(clave)) {
			macLigeros.put(clave, new MacLigero(ram, disco));
		}
		
		return macLigeros.get(clave);
	}
}

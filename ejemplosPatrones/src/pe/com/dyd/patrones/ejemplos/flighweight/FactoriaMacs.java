package pe.com.dyd.patrones.ejemplos.flighweight;

public class FactoriaMacs {
	public static MacBookAir crearMacBookAir(String id, int ram, int disco) {
		MacLigero macLigero = ContenedorMacLigero.getMacLigero(ram, disco);
		MacBookAir macBookAir = new MacBookAirImplFlighWeight(id, macLigero);
		return macBookAir;
	}
}

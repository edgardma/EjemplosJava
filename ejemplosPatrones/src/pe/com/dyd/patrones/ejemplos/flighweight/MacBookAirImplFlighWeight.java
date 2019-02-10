package pe.com.dyd.patrones.ejemplos.flighweight;

public class MacBookAirImplFlighWeight implements MacBookAir {
	private String id;
	private MacLigero macLigero;
	
	
	public MacBookAirImplFlighWeight(String id, MacLigero macLigero) {
		super();
		this.id = id;
		this.macLigero = macLigero;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public int getRam() {
		// TODO Auto-generated method stub
		return macLigero.getRam();
	}

	@Override
	public int getDisco() {
		// TODO Auto-generated method stub
		return macLigero.getDisco();
	}

}

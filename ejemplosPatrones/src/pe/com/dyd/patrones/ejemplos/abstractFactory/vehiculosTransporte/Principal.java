package pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte;

import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.fabricas.FabricaBuses;
import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.fabricas.FabricaDeVehiculos;
import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.fabricas.FabricaTaxis;

public class Principal {
	public static void main(String[] args) {
		FabricaBuses buses = new FabricaBuses();
		FabricaTaxis taxis = new FabricaTaxis();
		
		FabricaDeVehiculos.crearFabricaDeVeniculos(taxis);
		FabricaDeVehiculos.crearFabricaDeVeniculos(buses);
	}
}

package pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.fabricas;

import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.Vehiculo;
import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.VehiculoDeTransporte;
import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.model.Taxi;

public class FabricaTaxis implements VehiculoDeTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		Taxi miTaxi = new Taxi();
		miTaxi.setCodigo(miTaxi.generarCodigo());
		System.out.println("Se ha creado un nuevo objeto Taxi.");
		return miTaxi;
	}
	
}

package pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.fabricas;

import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.Vehiculo;
import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.VehiculoDeTransporte;
import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.model.Bus;

public class FabricaBuses implements VehiculoDeTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		Bus miBus = new Bus();
		miBus.setCodigo(miBus.generarCodigo());
		System.out.println("Se ha creado un nuevo objeto Bus.");
		return miBus;
	}

}

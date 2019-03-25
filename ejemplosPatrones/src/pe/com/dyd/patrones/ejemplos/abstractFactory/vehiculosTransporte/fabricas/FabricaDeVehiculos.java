package pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.fabricas;

import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.Vehiculo;
import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.VehiculoDeTransporte;

public class FabricaDeVehiculos {
	public static void crearFabricaDeVeniculos(VehiculoDeTransporte factory) {
		Vehiculo objetoVehiculo = factory.crearVehiculo();
		objetoVehiculo.devolverCodigoVehiculo();
	}
}

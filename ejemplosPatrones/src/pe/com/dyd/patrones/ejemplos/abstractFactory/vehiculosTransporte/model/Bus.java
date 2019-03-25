package pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.model;

import pe.com.dyd.patrones.ejemplos.abstractFactory.vehiculosTransporte.Vehiculo;

public class Bus implements Vehiculo {
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void devolverCodigoVehiculo() {
		System.out.println("El código del Bus es " + getCodigo());
	}

	@Override
	public int generarCodigo() {
		int codigoBus = (int) (Math.random() * 9999);
		return codigoBus;
	}	
}

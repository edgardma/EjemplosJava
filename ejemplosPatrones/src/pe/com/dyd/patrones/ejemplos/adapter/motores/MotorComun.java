package pe.com.dyd.patrones.ejemplos.adapter.motores;

public class MotorComun extends Motor {
	
	public MotorComun() {
		super();
		System.out.println("Creando el motor comun");
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor comun");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar motor comun");
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor comun");
	}

}

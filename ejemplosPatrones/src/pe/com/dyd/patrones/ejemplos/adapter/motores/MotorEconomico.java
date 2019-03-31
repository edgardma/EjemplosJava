package pe.com.dyd.patrones.ejemplos.adapter.motores;

public class MotorEconomico extends Motor {
	
	public MotorEconomico() {
		super();
		System.out.println("Creando el motor economico");
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor economico");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar motor economico");
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor economico");
	}

}

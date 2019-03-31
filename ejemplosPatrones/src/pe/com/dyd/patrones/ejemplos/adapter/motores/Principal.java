package pe.com.dyd.patrones.ejemplos.adapter.motores;

/*
 * Link: http://codejavu.blogspot.com/2013/08/ejemplo-patron-adapter.html
 */

public class Principal {

	public static void main(String[] args) {
		System.out.println("================================");
		usarMotorComun();
		System.out.println("================================");
		usarMotorElectrico();
		System.out.println("================================");
		usarMotorEconomico();
		System.out.println("================================");
	}
	
	private static void usarMotorComun() {
		Motor motor = new MotorComun();
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}
	
	private static void usarMotorElectrico() {
		Motor motor = new MotorElectricoAdapter();
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}
	
	private static void usarMotorEconomico() {
		Motor motor = new MotorEconomico();
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}
}

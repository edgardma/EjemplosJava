package pe.com.dyd.patrones.ejemplos.adapter.motores;

public class MotorElectricoAdapter extends Motor {
	private MotorElectrico motorElectrico;
	
	public MotorElectricoAdapter() {
		super();
		this.motorElectrico = new MotorElectrico();
		System.out.println("Creando Motor Electrico Adapter");
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo Motor Electrico Adapter");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando Motor Electrico Adapter");
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		System.out.println("Apagando Motor Electrico Adapter");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}

}

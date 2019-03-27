package pe.com.dyd.patrones.ejemplos.abstractFactory.general;

import pe.com.dyd.patrones.ejemplos.abstractFactory.animals.AnimalFactory;
import pe.com.dyd.patrones.ejemplos.abstractFactory.general.AbstractFactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String choice) {
		if ("Animal".equalsIgnoreCase(choice)) {
			return new AnimalFactory();
		}
		
		return null;
	}
}

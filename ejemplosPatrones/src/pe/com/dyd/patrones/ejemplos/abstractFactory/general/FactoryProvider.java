package pe.com.dyd.patrones.ejemplos.abstractFactory.general;

import pe.com.dyd.patrones.ejemplos.abstractFactory.animals.AnimalFactory;
import pe.com.dyd.patrones.ejemplos.abstractFactory.colors.ColorFactory;
import pe.com.dyd.patrones.ejemplos.abstractFactory.general.AbstractFactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String choice) {
		if ("Animal".equalsIgnoreCase(choice)) {
			return new AnimalFactory();
		} else if ("Color".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}
		
		return null;
	}
}

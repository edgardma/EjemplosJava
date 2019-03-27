package pe.com.dyd.patrones.ejemplos.abstractFactory.animals;

import pe.com.dyd.patrones.ejemplos.abstractFactory.general.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String type) {
		if ("Dog".equalsIgnoreCase(type)) {
			return new Dog();
		} else if ("Duck".equalsIgnoreCase(type)) {
			return new Duck();
		}
		
		return null;
	}

}

package pe.com.dyd.patrones.ejemplos.abstractFactory.general;

import pe.com.dyd.patrones.ejemplos.abstractFactory.animals.Animal;
import pe.com.dyd.patrones.ejemplos.abstractFactory.colors.Color;
import pe.com.dyd.patrones.ejemplos.abstractFactory.general.AbstractFactory;

public class Principal {
	public static void main(String[] args) {
		
		AbstractFactory<Animal> fabricaAbstracta = FactoryProvider.getFactory("Animal");
		Animal animal = fabricaAbstracta.create("Dog");
		System.out.println(animal.getAnimal());
		System.out.println(animal.makeSound());
		
		AbstractFactory<Color> fabricaColorAbstracta = FactoryProvider.getFactory("Color");
		Color color = fabricaColorAbstracta.create("White");
		System.out.println(color.getColor());
	}
}

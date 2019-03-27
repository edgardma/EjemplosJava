package pe.com.dyd.patrones.ejemplos.abstractFactory.animals;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "Wua, wua";
	}
}
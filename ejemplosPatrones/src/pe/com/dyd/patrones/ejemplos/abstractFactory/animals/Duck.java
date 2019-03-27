package pe.com.dyd.patrones.ejemplos.abstractFactory.animals;

public class Duck implements Animal {

	@Override
	public String getAnimal() {
		return "Duck";
	}

	@Override
	public String makeSound() {
		return "Squeks";
	}

}

package pe.com.dyd.patrones.ejemplos.abstractFactory.general;

public interface AbstractFactory<T> {
	T create(String type);
}

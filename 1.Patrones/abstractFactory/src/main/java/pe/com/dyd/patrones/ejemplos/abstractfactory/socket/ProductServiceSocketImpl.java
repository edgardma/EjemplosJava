package pe.com.dyd.patrones.ejemplos.abstractfactory.socket;

import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IProductsService;

public class ProductServiceSocketImpl implements IProductsService {
	private static final String[] PRODUCTS = new String[] {"Libro", "Cuaderno", "Lapicero"};
	
	@Override
	public String[] getProducts() {
		System.out.println("Socket");
		return PRODUCTS;
	}
	
}

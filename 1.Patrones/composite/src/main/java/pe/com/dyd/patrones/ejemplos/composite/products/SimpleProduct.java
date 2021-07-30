package pe.com.dyd.patrones.ejemplos.composite.products;

public class SimpleProduct extends AbstractProduct {
	
	protected String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public SimpleProduct(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
}

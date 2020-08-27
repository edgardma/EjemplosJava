package pe.com.dyd.patrones.ejemplos.factoryMethod;

import java.util.List;

import pe.com.dyd.patrones.ejemplos.factoryMethod.dao.ProductDAO;
import pe.com.dyd.patrones.ejemplos.factoryMethod.entity.Product;

public class FactoryMain {
	public static void main(String[] args) {
		Product productA = new Product(1L, "Product A", 100);
		Product productB = new Product(2L, "Product B", 100);
		
		ProductDAO productDAO = new ProductDAO();
		
		productDAO.saveProduct(productA);
		productDAO.saveProduct(productB);
		
		List<Product> products = productDAO.findAllProducts();
		System.out.print("Product size ==>" + products.size());
		
		for(Product product:products) {
			System.out.println(product);
		}
	}
}

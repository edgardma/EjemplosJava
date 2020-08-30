package pe.com.dyd.patrones.ejemplos.factoryMethod;

import java.util.List;

import pe.com.dyd.patrones.ejemplos.factoryMethod.dao.ProductDAO;
import pe.com.dyd.patrones.ejemplos.factoryMethod.entity.Product;

public class FactoryMain {
	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		
		productDAO.saveProduct(new Product(1L, "Product A", 100));
		productDAO.saveProduct(new Product(2L, "Product B", 100));
		
		List<Product> products = productDAO.findAllProducts();
		System.out.print("Product size ==>" + products.size());
		
		for(Product product:products) {
			System.out.println(product);
		}
	}
}

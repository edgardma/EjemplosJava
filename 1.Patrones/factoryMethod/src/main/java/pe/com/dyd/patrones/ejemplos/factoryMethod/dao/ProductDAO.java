package pe.com.dyd.patrones.ejemplos.factoryMethod.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.com.dyd.patrones.ejemplos.factoryMethod.DBFactory;
import pe.com.dyd.patrones.ejemplos.factoryMethod.IDBAdapter;
import pe.com.dyd.patrones.ejemplos.factoryMethod.entity.Product;

public class ProductDAO {
	private IDBAdapter dbAdapter;
	
	public ProductDAO() {
		dbAdapter = DBFactory.getDefaultDBAdapter();
	}
	
	public List<Product> findAllProducts() {
		Connection connection = dbAdapter.getConnection();
		List<Product> productList = new ArrayList<>();
		
		try {
			PreparedStatement stament = connection.prepareStatement(
					"SELECT idProductos, productName, productPrice FROM productos");
			ResultSet results = stament.executeQuery();
			while (results.next()) {
				productList.add(new Product(
						results.getLong(1), 
						results.getString(2),
						results.getDouble(3)));
			}
			return productList;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				connection.close();
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public boolean saveProduct(Product product) {
		Connection connection = dbAdapter.getConnection();
		
		try {
			PreparedStatement stament = connection.prepareStatement(
					"INSERT INTO productos(idProductos, productName, productPrice) VALUES (?, ?, ?)");
			stament.setLong(1, product.getIdProduct());
			stament.setString(2, product.getProductName());
			stament.setDouble(3, product.getPrice());
			stament.executeUpdate();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				connection.close();
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}

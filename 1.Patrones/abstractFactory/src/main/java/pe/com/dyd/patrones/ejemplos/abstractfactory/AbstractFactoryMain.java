package pe.com.dyd.patrones.ejemplos.abstractfactory;

import java.util.Arrays;

import pe.com.dyd.patrones.ejemplos.abstractfactory.impl.IServiceStackAbstractFactory;
import pe.com.dyd.patrones.ejemplos.abstractfactory.impl.ServiceStackAbstractFactory;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IEmployeeService;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IProductsService;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
		IEmployeeService employeeService = factory.getEmployeeService();
		IProductsService productService = factory.getProductsService();
		
		System.out.println("EmployeeService class > " + employeeService.getClass().getCanonicalName());
		System.out.println("ProductService class > " + productService.getClass().getCanonicalName());
		
		System.out.println("getEmployee > " + Arrays.deepToString(employeeService.getEmployee()));
		System.out.println("getProduct > " + Arrays.deepToString(productService.getProducts()));
	}
}

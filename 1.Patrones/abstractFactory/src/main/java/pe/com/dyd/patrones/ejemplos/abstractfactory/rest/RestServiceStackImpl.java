package pe.com.dyd.patrones.ejemplos.abstractfactory.rest;

import pe.com.dyd.patrones.ejemplos.abstractfactory.impl.IServiceStackAbstractFactory;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IEmployeeService;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IProductsService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceRestImpl();
	}

	@Override
	public IProductsService getProductsService() {
		return new ProductServiceRestImpl();
	}
	
}

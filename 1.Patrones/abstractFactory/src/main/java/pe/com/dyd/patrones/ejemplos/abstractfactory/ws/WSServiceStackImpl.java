package pe.com.dyd.patrones.ejemplos.abstractfactory.ws;

import pe.com.dyd.patrones.ejemplos.abstractfactory.impl.IServiceStackAbstractFactory;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IEmployeeService;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IProductsService;

public class WSServiceStackImpl implements IServiceStackAbstractFactory {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceWSImpl();
	}

	@Override
	public IProductsService getProductsService() {
		return new ProductServiceWSImpl();
	}

}

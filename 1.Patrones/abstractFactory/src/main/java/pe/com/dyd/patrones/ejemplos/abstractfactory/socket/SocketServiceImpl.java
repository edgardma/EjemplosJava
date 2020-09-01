package pe.com.dyd.patrones.ejemplos.abstractfactory.socket;

import pe.com.dyd.patrones.ejemplos.abstractfactory.impl.IServiceStackAbstractFactory;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IEmployeeService;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IProductsService;

public class SocketServiceImpl implements IServiceStackAbstractFactory {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceSocketImpl();
	}

	@Override
	public IProductsService getProductsService() {
		return new ProductServiceSocketImpl();
	}

}

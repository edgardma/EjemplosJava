package pe.com.dyd.patrones.ejemplos.abstractfactory.impl;

import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IEmployeeService;
import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IProductsService;

public interface IServiceStackAbstractFactory {
	public IEmployeeService getEmployeeService();
	public IProductsService getProductsService();
}

package pe.com.dyd.patrones.ejemplos.abstractfactory.rest;

import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IEmployeeService;

public class EmployeeServiceRestImpl implements IEmployeeService {
	private static final String[] EMPLOYEES = new String[] {"Juan", "Pedro", "Manuel"};

	@Override
	public String[] getEmployee() {
		System.out.println("Restul");
		return EMPLOYEES;
	}

}

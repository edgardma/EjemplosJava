package pe.com.dyd.patrones.ejemplos.abstractfactory.socket;

import pe.com.dyd.patrones.ejemplos.abstractfactory.service.IEmployeeService;

public class EmployeeServiceSocketImpl implements IEmployeeService {
	private static final String[] EMPLOYEES = new String[] {"James", "Patrick", "Michael"};
	
	@Override
	public String[] getEmployee() {
		System.out.println("Socket");
		return EMPLOYEES;
	}

}

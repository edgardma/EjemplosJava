package pe.com.dyd.ejercicios;

import java.util.Arrays;
import java.util.List;

import pe.com.dyd.ejercicios.entity.Employee;

/**
 * 3rd Largest salary from a Employee list using Java 8 
 * Source: https://www.youtube.com/watch?v=akNLS8ggS_s
 */
public class ThirdLargesSalary {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "A", 500000),
				new Employee(2, "B", 5000),
				new Employee(3, "C", 123),
				new Employee(4, "D", 673),
				new Employee(5, "E", 510000),
				new Employee(6, "F", 9999));
		
		 System.out.println(empList.stream().sorted((a, b) -> (b.getSalary() - a.getSalary())).skip(1).map(Employee :: getName).findFirst().get());
		 System.out.println(empList.stream().sorted((a, b) -> (b.getSalary() - a.getSalary())).skip(2).map(Employee :: getName).findFirst().get());
		 System.out.println(empList.stream().sorted((a, b) -> (b.getSalary() - a.getSalary())).skip(3).map(Employee :: getName).findFirst().get());
	}

}

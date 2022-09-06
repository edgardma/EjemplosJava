package pe.com.dyd.ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pe.com.dyd.ejercicios.entity.Employee;

/**
 * Sort List of Employee based on their salary using Java 8
 * Source: https://www.youtube.com/watch?v=akNLS8ggS_s
 */

public class SortEmployeeBasedOnSalary {
	
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "A", 500000),
				new Employee(2, "B", 5000),
				new Employee(3, "C", 123),
				new Employee(4, "D", 673),
				new Employee(5, "E", 510000),
				new Employee(6, "F", 9999));
		
		List<Employee> sortedList =  empList.stream().sorted((a, b) -> (b.getSalary() - a.getSalary())).collect(Collectors.toList());
		
		System.out.println(sortedList);
	}
	
}

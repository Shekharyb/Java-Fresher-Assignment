package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	/**
	 * Returns the primary employee record surfaced on the Summary tab.
	 */
	Employee getPrimaryEmployee();
}

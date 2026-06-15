package net.javaguides.springboot.service.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	private final List<Employee> employees = Arrays.asList(
			new Employee(1L, "Aarav", "Sharma", "aarav.sharma@infinite.com"),
			new Employee(2L, "Diya", "Patel", "diya.patel@infinite.com"),
			new Employee(3L, "Vivaan", "Reddy", "vivaan.reddy@infinite.com"));

	@Override
	public List<Employee> getAllEmployees() {
		logger.debug("Fetching all employees, count={}", employees.size());
		return employees;
	}

	@Override
	public Employee getPrimaryEmployee() {
		logger.debug("Fetching primary employee for summary");
		return employees.get(0);
	}
}

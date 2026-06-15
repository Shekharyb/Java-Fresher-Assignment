package net.javaguides.springboot.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

/**
 * Service backing the Employees (directory) tab.
 */
@Service
public class EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		logger.info("Fetching all employees for the Employees tab");
		return employeeRepository.findAll();
	}

	public long getTotalEmployeeCount() {
		long count = employeeRepository.count();
		logger.info("Total employee count: {}", count);
		return count;
	}

	public Optional<Employee> getLatestEmployee() {
		return employeeRepository.findAll().stream().max(Comparator.comparingLong(Employee::getId));
	}
}

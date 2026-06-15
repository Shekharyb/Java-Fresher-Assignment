package net.javaguides.springboot.service.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Department;
import net.javaguides.springboot.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

	private final List<Department> departments = Arrays.asList(
			new Department(1L, "Engineering", "Bengaluru", 42),
			new Department(2L, "Human Resources", "Pune", 8),
			new Department(3L, "Finance", "Mumbai", 12));

	@Override
	public List<Department> getAllDepartments() {
		logger.debug("Fetching all departments, count={}", departments.size());
		return departments;
	}

	@Override
	public Department getPrimaryDepartment() {
		logger.debug("Fetching primary department for summary");
		return departments.get(0);
	}
}

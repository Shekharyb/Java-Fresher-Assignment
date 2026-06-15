package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Department;

public interface DepartmentService {

	List<Department> getAllDepartments();

	/**
	 * Returns the primary department record surfaced on the Summary tab.
	 */
	Department getPrimaryDepartment();
}

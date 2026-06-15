package net.javaguides.springboot.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.DepartmentDto;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

/**
 * Service backing the Departments tab. Aggregates headcount per department.
 */
@Service
public class DepartmentService {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<DepartmentDto> getDepartmentBreakdown() {
		logger.info("Aggregating department headcount for the Departments tab");
		Map<String, Long> grouped = employeeRepository.findAll().stream()
				.collect(Collectors.groupingBy(this::resolveDepartment, Collectors.counting()));
		return grouped.entrySet().stream()
				.map(entry -> new DepartmentDto(entry.getKey(), entry.getValue()))
				.sorted((a, b) -> Long.compare(b.getEmployeeCount(), a.getEmployeeCount()))
				.collect(Collectors.toList());
	}

	public String getTopDepartment() {
		String top = getDepartmentBreakdown().stream()
				.findFirst()
				.map(DepartmentDto::getDepartment)
				.orElse("N/A");
		logger.info("Top department by headcount: {}", top);
		return top;
	}

	private String resolveDepartment(Employee employee) {
		String department = employee.getDepartment();
		return (department == null || department.trim().isEmpty()) ? "Unassigned" : department.trim();
	}
}

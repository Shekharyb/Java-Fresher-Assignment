package net.javaguides.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.PayrollDto;
import net.javaguides.springboot.repository.EmployeeRepository;

/**
 * Service backing the Payroll tab. Exposes salary details and totals.
 */
@Service
public class PayrollService {

	private static final Logger logger = LoggerFactory.getLogger(PayrollService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<PayrollDto> getPayrollList() {
		logger.info("Building payroll list for the Payroll tab");
		return employeeRepository.findAll().stream()
				.map(e -> new PayrollDto(e.getId(),
						(safe(e.getFirstName()) + " " + safe(e.getLastName())).trim(),
						e.getDepartment(), e.getSalary()))
				.collect(Collectors.toList());
	}

	public double getTotalMonthlyPayroll() {
		double total = employeeRepository.findAll().stream().mapToDouble(e -> e.getSalary()).sum();
		logger.info("Total monthly payroll: {}", total);
		return total;
	}

	private static String safe(String value) {
		return value == null ? "" : value.trim();
	}
}

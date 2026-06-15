package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Payroll;

public interface PayrollService {

	List<Payroll> getAllPayroll();

	/**
	 * Returns the latest payroll record surfaced on the Summary tab.
	 */
	Payroll getLatestPayroll();
}

package net.javaguides.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.viewmodel.SummaryViewModel;

/**
 * Aggregates one key field from each of the five module tabs into a single
 * read-only {@link SummaryViewModel} for the Summary tab. Reuses the existing
 * module services rather than querying the repository directly.
 */
@Service
public class SummaryService {

	private static final Logger logger = LoggerFactory.getLogger(SummaryService.class);

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private PersonalInfoService personalInfoService;

	@Autowired
	private ContactService contactService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private PayrollService payrollService;

	public SummaryViewModel buildSummary() {
		logger.info("Aggregating summary data from all five module tabs");
		SummaryViewModel summary = new SummaryViewModel();
		summary.setTotalEmployees(employeeService.getTotalEmployeeCount());
		summary.setLatestEmployeeName(personalInfoService.getLatestEmployeeFullName());
		summary.setPrimaryEmail(contactService.getPrimaryEmail());
		summary.setTopDepartment(departmentService.getTopDepartment());
		summary.setTotalMonthlyPayroll(payrollService.getTotalMonthlyPayroll());
		return summary;
	}
}

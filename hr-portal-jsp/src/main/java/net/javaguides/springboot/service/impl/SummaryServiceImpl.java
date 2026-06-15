package net.javaguides.springboot.service.impl;

import java.text.NumberFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.SummaryDTO;
import net.javaguides.springboot.model.Attendance;
import net.javaguides.springboot.model.Department;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Payroll;
import net.javaguides.springboot.model.Project;
import net.javaguides.springboot.service.AttendanceService;
import net.javaguides.springboot.service.DepartmentService;
import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.service.PayrollService;
import net.javaguides.springboot.service.ProjectService;
import net.javaguides.springboot.service.SummaryService;

@Service
public class SummaryServiceImpl implements SummaryService {

	private static final Logger logger = LoggerFactory.getLogger(SummaryServiceImpl.class);

	private static final NumberFormat CURRENCY = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

	private final EmployeeService employeeService;
	private final DepartmentService departmentService;
	private final ProjectService projectService;
	private final AttendanceService attendanceService;
	private final PayrollService payrollService;

	public SummaryServiceImpl(EmployeeService employeeService, DepartmentService departmentService,
			ProjectService projectService, AttendanceService attendanceService, PayrollService payrollService) {
		this.employeeService = employeeService;
		this.departmentService = departmentService;
		this.projectService = projectService;
		this.attendanceService = attendanceService;
		this.payrollService = payrollService;
	}

	@Override
	public SummaryDTO getSummary() {
		logger.info("Aggregating summary data from all five module tabs");

		Employee employee = employeeService.getPrimaryEmployee();
		Department department = departmentService.getPrimaryDepartment();
		Project project = projectService.getActiveProject();
		Attendance attendance = attendanceService.getLatestAttendance();
		Payroll payroll = payrollService.getLatestPayroll();

		SummaryDTO summary = new SummaryDTO(
				employee.getFullName(),
				department.getName(),
				project.getName(),
				attendance.getAttendancePercentage() + "%",
				CURRENCY.format(payroll.getNet()));

		logger.debug("Summary aggregation complete: {}", summary.getEmployeeName());
		return summary;
	}
}

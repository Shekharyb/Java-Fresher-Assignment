package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.ContactService;
import net.javaguides.springboot.service.DepartmentService;
import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.service.PayrollService;
import net.javaguides.springboot.service.PersonalInfoService;

/**
 * MVC controller serving the five module tabs (Employees, Personal, Contact,
 * Departments, Payroll) rendered as JSP views.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

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

	@GetMapping({ "/", "/employees" })
	public String employees(Model model) {
		logger.info("Loading Employees tab");
		model.addAttribute("activeTab", "employees");
		model.addAttribute("employees", employeeService.getAllEmployees());
		model.addAttribute("totalEmployees", employeeService.getTotalEmployeeCount());
		return "index";
	}

	@GetMapping("/personal")
	public String personal(Model model) {
		logger.info("Loading Personal tab");
		model.addAttribute("activeTab", "personal");
		model.addAttribute("personalInfoList", personalInfoService.getPersonalInfoList());
		return "personal";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		logger.info("Loading Contact tab");
		model.addAttribute("activeTab", "contact");
		model.addAttribute("contactList", contactService.getContactList());
		return "contact";
	}

	@GetMapping("/departments")
	public String departments(Model model) {
		logger.info("Loading Departments tab");
		model.addAttribute("activeTab", "departments");
		model.addAttribute("departmentList", departmentService.getDepartmentBreakdown());
		return "departments";
	}

	@GetMapping("/payroll")
	public String payroll(Model model) {
		logger.info("Loading Payroll tab");
		model.addAttribute("activeTab", "payroll");
		model.addAttribute("payrollList", payrollService.getPayrollList());
		model.addAttribute("totalMonthlyPayroll", payrollService.getTotalMonthlyPayroll());
		return "payroll";
	}
}

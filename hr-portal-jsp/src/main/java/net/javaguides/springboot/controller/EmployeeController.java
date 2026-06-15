package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/employee")
	public String employee(Model model) {
		logger.info("Loading Employee tab");
		model.addAttribute("activeTab", "employee");
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employee";
	}
}

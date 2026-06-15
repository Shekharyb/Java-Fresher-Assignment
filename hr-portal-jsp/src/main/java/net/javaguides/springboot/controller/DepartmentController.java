package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.DepartmentService;

@Controller
public class DepartmentController {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@GetMapping("/department")
	public String department(Model model) {
		logger.info("Loading Department tab");
		model.addAttribute("activeTab", "department");
		model.addAttribute("departments", departmentService.getAllDepartments());
		return "department";
	}
}

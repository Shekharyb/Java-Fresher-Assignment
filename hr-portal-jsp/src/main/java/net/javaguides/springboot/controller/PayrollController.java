package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.PayrollService;

@Controller
public class PayrollController {

	private static final Logger logger = LoggerFactory.getLogger(PayrollController.class);

	private final PayrollService payrollService;

	public PayrollController(PayrollService payrollService) {
		this.payrollService = payrollService;
	}

	@GetMapping("/payroll")
	public String payroll(Model model) {
		logger.info("Loading Payroll tab");
		model.addAttribute("activeTab", "payroll");
		model.addAttribute("payrolls", payrollService.getAllPayroll());
		return "payroll";
	}
}

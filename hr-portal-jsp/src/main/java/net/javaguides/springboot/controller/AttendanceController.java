package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.AttendanceService;

@Controller
public class AttendanceController {

	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);

	private final AttendanceService attendanceService;

	public AttendanceController(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
	}

	@GetMapping("/attendance")
	public String attendance(Model model) {
		logger.info("Loading Attendance tab");
		model.addAttribute("activeTab", "attendance");
		model.addAttribute("attendanceRecords", attendanceService.getAllAttendance());
		return "attendance";
	}
}

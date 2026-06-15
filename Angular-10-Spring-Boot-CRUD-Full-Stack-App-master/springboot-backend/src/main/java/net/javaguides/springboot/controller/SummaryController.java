package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.SummaryService;
import net.javaguides.springboot.viewmodel.SummaryViewModel;

/**
 * MVC controller for the read-only Summary tab. Loads a quick-reference card
 * aggregating one key field from each of the five module tabs.
 */
@Controller
public class SummaryController {

	private static final Logger logger = LoggerFactory.getLogger(SummaryController.class);

	@Autowired
	private SummaryService summaryService;

	@GetMapping("/summary")
	public String summary(Model model) {
		logger.info("Loading Summary tab");
		SummaryViewModel summary = summaryService.buildSummary();
		model.addAttribute("activeTab", "summary");
		model.addAttribute("summary", summary);
		return "summary";
	}
}

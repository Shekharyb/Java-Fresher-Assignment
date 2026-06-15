package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.dto.SummaryDTO;
import net.javaguides.springboot.service.SummaryService;

/**
 * Serves the read-only Summary tab, which aggregates one key field from each of
 * the five existing module tabs.
 */
@Controller
public class SummaryController {

	private static final Logger logger = LoggerFactory.getLogger(SummaryController.class);

	private final SummaryService summaryService;

	public SummaryController(SummaryService summaryService) {
		this.summaryService = summaryService;
	}

	@GetMapping("/summary")
	public String summary(Model model) {
		logger.info("Loading Summary tab");
		SummaryDTO summary = summaryService.getSummary();
		model.addAttribute("activeTab", "summary");
		model.addAttribute("summary", summary);
		return "summary";
	}
}

package net.javaguides.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.ProjectService;

@Controller
public class ProjectController {

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

	private final ProjectService projectService;

	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping("/project")
	public String project(Model model) {
		logger.info("Loading Project tab");
		model.addAttribute("activeTab", "project");
		model.addAttribute("projects", projectService.getAllProjects());
		return "project";
	}
}

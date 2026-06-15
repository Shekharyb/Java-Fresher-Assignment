package net.javaguides.springboot.service.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Project;
import net.javaguides.springboot.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	private static final Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);

	private final List<Project> projects = Arrays.asList(
			new Project(1L, "Atlas Migration", "Globex", "ACTIVE"),
			new Project(2L, "Phoenix Portal", "Initech", "ACTIVE"),
			new Project(3L, "Legacy Sunset", "Umbrella", "CLOSED"));

	@Override
	public List<Project> getAllProjects() {
		logger.debug("Fetching all projects, count={}", projects.size());
		return projects;
	}

	@Override
	public Project getActiveProject() {
		logger.debug("Fetching active project for summary");
		return projects.stream()
				.filter(project -> "ACTIVE".equalsIgnoreCase(project.getStatus()))
				.findFirst()
				.orElse(projects.get(0));
	}
}

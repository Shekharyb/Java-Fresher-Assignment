package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Project;

public interface ProjectService {

	List<Project> getAllProjects();

	/**
	 * Returns the active project surfaced on the Summary tab.
	 */
	Project getActiveProject();
}

package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.SummaryDTO;

public interface SummaryService {

	/**
	 * Aggregates one key field from each of the five module tabs into a single
	 * read-only DTO for the Summary tab.
	 */
	SummaryDTO getSummary();
}

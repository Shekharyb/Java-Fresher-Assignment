package net.javaguides.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.ContactDto;
import net.javaguides.springboot.repository.EmployeeRepository;

/**
 * Service backing the Contact tab. Exposes employees' contact details.
 */
@Service
public class ContactService {

	private static final Logger logger = LoggerFactory.getLogger(ContactService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeService employeeService;

	public List<ContactDto> getContactList() {
		logger.info("Building contact list for the Contact tab");
		return employeeRepository.findAll().stream()
				.map(e -> new ContactDto(e.getId(),
						(safe(e.getFirstName()) + " " + safe(e.getLastName())).trim(), e.getEmailId()))
				.collect(Collectors.toList());
	}

	public String getPrimaryEmail() {
		String email = employeeService.getLatestEmployee().map(e -> e.getEmailId()).orElse("N/A");
		logger.info("Primary contact email: {}", email);
		return email;
	}

	private static String safe(String value) {
		return value == null ? "" : value.trim();
	}
}

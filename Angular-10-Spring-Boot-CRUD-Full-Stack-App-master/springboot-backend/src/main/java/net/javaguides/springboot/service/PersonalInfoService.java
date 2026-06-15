package net.javaguides.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.PersonalInfoDto;
import net.javaguides.springboot.repository.EmployeeRepository;

/**
 * Service backing the Personal tab. Exposes employees' personal name details.
 */
@Service
public class PersonalInfoService {

	private static final Logger logger = LoggerFactory.getLogger(PersonalInfoService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeService employeeService;

	public List<PersonalInfoDto> getPersonalInfoList() {
		logger.info("Building personal info list for the Personal tab");
		return employeeRepository.findAll().stream()
				.map(e -> new PersonalInfoDto(e.getId(), e.getFirstName(), e.getLastName()))
				.collect(Collectors.toList());
	}

	public String getLatestEmployeeFullName() {
		String fullName = employeeService.getLatestEmployee()
				.map(e -> new PersonalInfoDto(e.getId(), e.getFirstName(), e.getLastName()).getFullName())
				.orElse("N/A");
		logger.info("Latest employee full name: {}", fullName);
		return fullName;
	}
}

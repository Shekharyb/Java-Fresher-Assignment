package net.javaguides.springboot.config;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

/**
 * Seeds a small set of sample employees on startup when the table is empty so
 * that every tab (including Summary) renders with meaningful data out of the
 * box. Existing data is never modified.
 */
@Configuration
public class DataInitializer {

	private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

	@Bean
	public CommandLineRunner seedEmployees(EmployeeRepository employeeRepository) {
		return args -> {
			if (employeeRepository.count() > 0) {
				logger.info("Employees already present; skipping sample data seeding");
				return;
			}
			logger.info("Seeding sample employees for demo");
			employeeRepository.saveAll(Arrays.asList(
					new Employee("Ramesh", "Fadatare", "ramesh@gmail.com", "Engineering", 85000),
					new Employee("John", "Cena", "john@gmail.com", "Engineering", 92000),
					new Employee("Tony", "Stark", "tony@gmail.com", "Finance", 120000),
					new Employee("Priya", "Sharma", "priya@gmail.com", "Human Resources", 65000)));
		};
	}
}

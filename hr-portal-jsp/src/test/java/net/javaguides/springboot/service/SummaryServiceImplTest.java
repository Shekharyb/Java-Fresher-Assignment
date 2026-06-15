package net.javaguides.springboot.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.javaguides.springboot.dto.SummaryDTO;

@SpringBootTest
class SummaryServiceImplTest {

	@Autowired
	private SummaryService summaryService;

	@Test
	void getSummary_pullsOneKeyFieldFromEachModule() {
		SummaryDTO summary = summaryService.getSummary();

		assertThat(summary.getEmployeeName()).isEqualTo("Aarav Sharma");
		assertThat(summary.getDepartmentName()).isEqualTo("Engineering");
		assertThat(summary.getActiveProject()).isEqualTo("Atlas Migration");
		assertThat(summary.getAttendancePercentage()).isEqualTo("90.9%");
		assertThat(summary.getNetSalary()).isNotBlank();
	}
}

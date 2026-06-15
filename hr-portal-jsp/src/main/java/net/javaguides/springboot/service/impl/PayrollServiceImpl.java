package net.javaguides.springboot.service.impl;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Payroll;
import net.javaguides.springboot.service.PayrollService;

@Service
public class PayrollServiceImpl implements PayrollService {

	private static final Logger logger = LoggerFactory.getLogger(PayrollServiceImpl.class);

	private final List<Payroll> payrolls = Arrays.asList(
			new Payroll(1L, "April 2026", new BigDecimal("85000"), new BigDecimal("12500")),
			new Payroll(2L, "May 2026", new BigDecimal("85000"), new BigDecimal("12500")),
			new Payroll(3L, "June 2026", new BigDecimal("90000"), new BigDecimal("13200")));

	@Override
	public List<Payroll> getAllPayroll() {
		logger.debug("Fetching all payroll records, count={}", payrolls.size());
		return payrolls;
	}

	@Override
	public Payroll getLatestPayroll() {
		logger.debug("Fetching latest payroll for summary");
		return payrolls.get(payrolls.size() - 1);
	}
}

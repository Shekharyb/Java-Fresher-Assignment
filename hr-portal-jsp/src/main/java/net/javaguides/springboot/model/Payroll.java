package net.javaguides.springboot.model;

import java.math.BigDecimal;

/**
 * Domain model backing the Payroll tab.
 */
public class Payroll {

	private long id;
	private String month;
	private BigDecimal gross;
	private BigDecimal deductions;

	public Payroll() {
	}

	public Payroll(long id, String month, BigDecimal gross, BigDecimal deductions) {
		this.id = id;
		this.month = month;
		this.gross = gross;
		this.deductions = deductions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public BigDecimal getGross() {
		return gross;
	}

	public void setGross(BigDecimal gross) {
		this.gross = gross;
	}

	public BigDecimal getDeductions() {
		return deductions;
	}

	public void setDeductions(BigDecimal deductions) {
		this.deductions = deductions;
	}

	public BigDecimal getNet() {
		if (gross == null) {
			return BigDecimal.ZERO;
		}
		return gross.subtract(deductions == null ? BigDecimal.ZERO : deductions);
	}
}

package net.javaguides.springboot.viewmodel;

/**
 * Aggregated, read-only quick-reference data for the Summary tab. Carries one
 * key field contributed by each of the five module tabs.
 */
public class SummaryViewModel {

	/** Employees tab: total number of employees. */
	private long totalEmployees;

	/** Personal tab: full name of the most recently added employee. */
	private String latestEmployeeName;

	/** Contact tab: primary contact email (most recently added employee). */
	private String primaryEmail;

	/** Departments tab: department with the highest headcount. */
	private String topDepartment;

	/** Payroll tab: total monthly payroll across all employees. */
	private double totalMonthlyPayroll;

	public long getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(long totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public String getLatestEmployeeName() {
		return latestEmployeeName;
	}

	public void setLatestEmployeeName(String latestEmployeeName) {
		this.latestEmployeeName = latestEmployeeName;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getTopDepartment() {
		return topDepartment;
	}

	public void setTopDepartment(String topDepartment) {
		this.topDepartment = topDepartment;
	}

	public double getTotalMonthlyPayroll() {
		return totalMonthlyPayroll;
	}

	public void setTotalMonthlyPayroll(double totalMonthlyPayroll) {
		this.totalMonthlyPayroll = totalMonthlyPayroll;
	}
}

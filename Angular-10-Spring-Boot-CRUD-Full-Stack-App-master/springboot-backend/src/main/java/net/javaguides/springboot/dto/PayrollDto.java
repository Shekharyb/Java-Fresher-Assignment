package net.javaguides.springboot.dto;

/**
 * Read-only view of an employee's payroll details, used by the Payroll tab.
 */
public class PayrollDto {

	private long id;
	private String fullName;
	private String department;
	private double salary;

	public PayrollDto() {
	}

	public PayrollDto(long id, String fullName, String department, double salary) {
		this.id = id;
		this.fullName = fullName;
		this.department = department;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

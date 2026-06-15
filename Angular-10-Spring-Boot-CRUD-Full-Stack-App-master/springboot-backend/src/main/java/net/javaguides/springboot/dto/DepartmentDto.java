package net.javaguides.springboot.dto;

/**
 * Aggregated headcount for a single department, used by the Departments tab.
 */
public class DepartmentDto {

	private String department;
	private long employeeCount;

	public DepartmentDto() {
	}

	public DepartmentDto(String department, long employeeCount) {
		this.department = department;
		this.employeeCount = employeeCount;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(long employeeCount) {
		this.employeeCount = employeeCount;
	}
}

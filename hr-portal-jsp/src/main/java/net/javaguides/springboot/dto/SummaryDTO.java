package net.javaguides.springboot.dto;

/**
 * Read-only view model that carries one key field from each of the five module
 * tabs to the Summary JSP. Built by {@code SummaryService} so the controller and
 * view never touch the individual domain models directly.
 */
public class SummaryDTO {

	private final String employeeName;
	private final String departmentName;
	private final String activeProject;
	private final String attendancePercentage;
	private final String netSalary;

	public SummaryDTO(String employeeName, String departmentName, String activeProject,
			String attendancePercentage, String netSalary) {
		this.employeeName = employeeName;
		this.departmentName = departmentName;
		this.activeProject = activeProject;
		this.attendancePercentage = attendancePercentage;
		this.netSalary = netSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getActiveProject() {
		return activeProject;
	}

	public String getAttendancePercentage() {
		return attendancePercentage;
	}

	public String getNetSalary() {
		return netSalary;
	}
}

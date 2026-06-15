package net.javaguides.springboot.dto;

/**
 * Read-only view of an employee's personal details, used by the Personal tab.
 */
public class PersonalInfoDto {

	private long id;
	private String firstName;
	private String lastName;
	private String fullName;

	public PersonalInfoDto() {
	}

	public PersonalInfoDto(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = buildFullName(firstName, lastName);
	}

	private static String buildFullName(String firstName, String lastName) {
		String first = firstName == null ? "" : firstName.trim();
		String last = lastName == null ? "" : lastName.trim();
		return (first + " " + last).trim();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}

package net.javaguides.springboot.dto;

/**
 * Read-only view of an employee's contact details, used by the Contact tab.
 */
public class ContactDto {

	private long id;
	private String fullName;
	private String emailId;

	public ContactDto() {
	}

	public ContactDto(long id, String fullName, String emailId) {
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}

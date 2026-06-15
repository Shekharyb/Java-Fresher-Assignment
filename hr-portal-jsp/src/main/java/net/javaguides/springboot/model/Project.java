package net.javaguides.springboot.model;

/**
 * Domain model backing the Project tab.
 */
public class Project {

	private long id;
	private String name;
	private String client;
	private String status;

	public Project() {
	}

	public Project(long id, String name, String client, String status) {
		this.id = id;
		this.name = name;
		this.client = client;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

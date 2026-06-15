package net.javaguides.springboot.model;

/**
 * Domain model backing the Department tab.
 */
public class Department {

	private long id;
	private String name;
	private String location;
	private int headcount;

	public Department() {
	}

	public Department(long id, String name, String location, int headcount) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.headcount = headcount;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getHeadcount() {
		return headcount;
	}

	public void setHeadcount(int headcount) {
		this.headcount = headcount;
	}
}

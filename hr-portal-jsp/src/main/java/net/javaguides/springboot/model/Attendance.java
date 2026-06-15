package net.javaguides.springboot.model;

/**
 * Domain model backing the Attendance tab.
 */
public class Attendance {

	private long id;
	private String month;
	private int presentDays;
	private int totalDays;

	public Attendance() {
	}

	public Attendance(long id, String month, int presentDays, int totalDays) {
		this.id = id;
		this.month = month;
		this.presentDays = presentDays;
		this.totalDays = totalDays;
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

	public int getPresentDays() {
		return presentDays;
	}

	public void setPresentDays(int presentDays) {
		this.presentDays = presentDays;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public double getAttendancePercentage() {
		if (totalDays == 0) {
			return 0d;
		}
		return Math.round((presentDays * 100.0 / totalDays) * 10.0) / 10.0;
	}
}

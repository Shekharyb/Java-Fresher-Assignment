package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Attendance;

public interface AttendanceService {

	List<Attendance> getAllAttendance();

	/**
	 * Returns the latest attendance record surfaced on the Summary tab.
	 */
	Attendance getLatestAttendance();
}

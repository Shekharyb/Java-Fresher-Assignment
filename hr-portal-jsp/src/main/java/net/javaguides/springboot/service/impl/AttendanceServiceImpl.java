package net.javaguides.springboot.service.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Attendance;
import net.javaguides.springboot.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	private static final Logger logger = LoggerFactory.getLogger(AttendanceServiceImpl.class);

	private final List<Attendance> attendanceRecords = Arrays.asList(
			new Attendance(1L, "April 2026", 21, 22),
			new Attendance(2L, "May 2026", 20, 21),
			new Attendance(3L, "June 2026", 10, 11));

	@Override
	public List<Attendance> getAllAttendance() {
		logger.debug("Fetching all attendance records, count={}", attendanceRecords.size());
		return attendanceRecords;
	}

	@Override
	public Attendance getLatestAttendance() {
		logger.debug("Fetching latest attendance for summary");
		return attendanceRecords.get(attendanceRecords.size() - 1);
	}
}

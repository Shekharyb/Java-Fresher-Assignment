<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Summary | Infinite HR Portal</title>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
	<%@ include file="fragments/navtabs.jsp" %>
	<div class="content">
		<h2>Summary</h2>
		<p class="readonly-note">Read-only quick-reference &mdash; one key field from each module tab.</p>
		<div class="summary-grid">
			<div class="summary-card">
				<div class="label">Employee</div>
				<div class="value"><c:out value="${summary.employeeName}"/></div>
				<div class="source">from Employee tab</div>
			</div>
			<div class="summary-card">
				<div class="label">Department</div>
				<div class="value"><c:out value="${summary.departmentName}"/></div>
				<div class="source">from Department tab</div>
			</div>
			<div class="summary-card">
				<div class="label">Active Project</div>
				<div class="value"><c:out value="${summary.activeProject}"/></div>
				<div class="source">from Project tab</div>
			</div>
			<div class="summary-card">
				<div class="label">Attendance</div>
				<div class="value"><c:out value="${summary.attendancePercentage}"/></div>
				<div class="source">from Attendance tab</div>
			</div>
			<div class="summary-card">
				<div class="label">Net Salary</div>
				<div class="value"><c:out value="${summary.netSalary}"/></div>
				<div class="source">from Payroll tab</div>
			</div>
		</div>
	</div>
</body>
</html>

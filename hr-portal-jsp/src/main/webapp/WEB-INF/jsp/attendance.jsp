<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Attendance | Infinite HR Portal</title>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
	<%@ include file="fragments/navtabs.jsp" %>
	<div class="content">
		<h2>Attendance</h2>
		<table class="data-table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Month</th>
					<th>Present Days</th>
					<th>Total Days</th>
					<th>Attendance %</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="record" items="${attendanceRecords}">
					<tr>
						<td>${record.id}</td>
						<td><c:out value="${record.month}"/></td>
						<td>${record.presentDays}</td>
						<td>${record.totalDays}</td>
						<td>${record.attendancePercentage}%</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Employee | Infinite HR Portal</title>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
	<%@ include file="fragments/navtabs.jsp" %>
	<div class="content">
		<h2>Employees</h2>
		<table class="data-table">
			<thead>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="employee" items="${employees}">
					<tr>
						<td>${employee.id}</td>
						<td><c:out value="${employee.firstName}"/></td>
						<td><c:out value="${employee.lastName}"/></td>
						<td><c:out value="${employee.emailId}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

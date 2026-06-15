<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Department | Infinite HR Portal</title>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
	<%@ include file="fragments/navtabs.jsp" %>
	<div class="content">
		<h2>Departments</h2>
		<table class="data-table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Location</th>
					<th>Headcount</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="department" items="${departments}">
					<tr>
						<td>${department.id}</td>
						<td><c:out value="${department.name}"/></td>
						<td><c:out value="${department.location}"/></td>
						<td>${department.headcount}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

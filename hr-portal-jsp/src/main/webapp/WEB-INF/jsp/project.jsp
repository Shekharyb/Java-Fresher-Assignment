<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Project | Infinite HR Portal</title>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
	<%@ include file="fragments/navtabs.jsp" %>
	<div class="content">
		<h2>Projects</h2>
		<table class="data-table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Client</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="project" items="${projects}">
					<tr>
						<td>${project.id}</td>
						<td><c:out value="${project.name}"/></td>
						<td><c:out value="${project.client}"/></td>
						<td><c:out value="${project.status}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

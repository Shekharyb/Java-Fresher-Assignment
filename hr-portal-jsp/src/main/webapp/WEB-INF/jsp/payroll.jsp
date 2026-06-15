<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Payroll | Infinite HR Portal</title>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
	<%@ include file="fragments/navtabs.jsp" %>
	<div class="content">
		<h2>Payroll</h2>
		<table class="data-table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Month</th>
					<th>Gross</th>
					<th>Deductions</th>
					<th>Net</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="payroll" items="${payrolls}">
					<tr>
						<td>${payroll.id}</td>
						<td><c:out value="${payroll.month}"/></td>
						<td><fmt:formatNumber value="${payroll.gross}" type="currency" currencySymbol="&#8377;"/></td>
						<td><fmt:formatNumber value="${payroll.deductions}" type="currency" currencySymbol="&#8377;"/></td>
						<td><fmt:formatNumber value="${payroll.net}" type="currency" currencySymbol="&#8377;"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

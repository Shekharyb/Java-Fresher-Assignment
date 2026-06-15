<%@ include file="fragments/header.jsp" %>

<h2 class="page-title">Payroll <span class="muted">(Total: <fmt:formatNumber value="${totalMonthlyPayroll}" type="currency" currencySymbol="$"/>)</span></h2>
<table class="data">
    <thead>
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Department</th>
            <th>Monthly Salary</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="pay" items="${payrollList}">
            <tr>
                <td>${pay.id}</td>
                <td><c:out value="${pay.fullName}"/></td>
                <td><c:out value="${pay.department}"/></td>
                <td><fmt:formatNumber value="${pay.salary}" type="currency" currencySymbol="$"/></td>
            </tr>
        </c:forEach>
        <c:if test="${empty payrollList}">
            <tr><td colspan="4" class="muted">No payroll records found.</td></tr>
        </c:if>
    </tbody>
</table>

<%@ include file="fragments/footer.jsp" %>

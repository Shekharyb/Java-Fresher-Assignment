<%@ include file="fragments/header.jsp" %>

<h2 class="page-title">Employees <span class="muted">(${totalEmployees} total)</span></h2>
<table class="data">
    <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Salary</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td><c:out value="${employee.firstName}"/></td>
                <td><c:out value="${employee.lastName}"/></td>
                <td><c:out value="${employee.emailId}"/></td>
                <td><c:out value="${employee.department}"/></td>
                <td><fmt:formatNumber value="${employee.salary}" type="currency" currencySymbol="$"/></td>
            </tr>
        </c:forEach>
        <c:if test="${empty employees}">
            <tr><td colspan="6" class="muted">No employees found.</td></tr>
        </c:if>
    </tbody>
</table>

<%@ include file="fragments/footer.jsp" %>

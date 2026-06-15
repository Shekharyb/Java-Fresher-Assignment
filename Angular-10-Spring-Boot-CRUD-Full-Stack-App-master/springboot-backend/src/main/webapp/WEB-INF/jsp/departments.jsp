<%@ include file="fragments/header.jsp" %>

<h2 class="page-title">Departments</h2>
<table class="data">
    <thead>
        <tr>
            <th>Department</th>
            <th>Employee Count</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="dept" items="${departmentList}">
            <tr>
                <td><c:out value="${dept.department}"/></td>
                <td>${dept.employeeCount}</td>
            </tr>
        </c:forEach>
        <c:if test="${empty departmentList}">
            <tr><td colspan="2" class="muted">No departments found.</td></tr>
        </c:if>
    </tbody>
</table>

<%@ include file="fragments/footer.jsp" %>

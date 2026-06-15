<%@ include file="fragments/header.jsp" %>

<h2 class="page-title">Personal Details</h2>
<table class="data">
    <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Full Name</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="person" items="${personalInfoList}">
            <tr>
                <td>${person.id}</td>
                <td><c:out value="${person.firstName}"/></td>
                <td><c:out value="${person.lastName}"/></td>
                <td><c:out value="${person.fullName}"/></td>
            </tr>
        </c:forEach>
        <c:if test="${empty personalInfoList}">
            <tr><td colspan="4" class="muted">No personal records found.</td></tr>
        </c:if>
    </tbody>
</table>

<%@ include file="fragments/footer.jsp" %>

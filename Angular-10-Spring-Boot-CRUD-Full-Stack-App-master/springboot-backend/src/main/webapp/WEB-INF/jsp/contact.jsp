<%@ include file="fragments/header.jsp" %>

<h2 class="page-title">Contact Details</h2>
<table class="data">
    <thead>
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Email</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="contact" items="${contactList}">
            <tr>
                <td>${contact.id}</td>
                <td><c:out value="${contact.fullName}"/></td>
                <td><c:out value="${contact.emailId}"/></td>
            </tr>
        </c:forEach>
        <c:if test="${empty contactList}">
            <tr><td colspan="3" class="muted">No contact records found.</td></tr>
        </c:if>
    </tbody>
</table>

<%@ include file="fragments/footer.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="app-header">
	<h1>Infinite HR Portal</h1>
	<p>Employee management quick-access console</p>
</div>
<nav class="tabs">
	<a href="<c:url value='/employee'/>" class="${activeTab == 'employee' ? 'active' : ''}">Employee</a>
	<a href="<c:url value='/department'/>" class="${activeTab == 'department' ? 'active' : ''}">Department</a>
	<a href="<c:url value='/project'/>" class="${activeTab == 'project' ? 'active' : ''}">Project</a>
	<a href="<c:url value='/attendance'/>" class="${activeTab == 'attendance' ? 'active' : ''}">Attendance</a>
	<a href="<c:url value='/payroll'/>" class="${activeTab == 'payroll' ? 'active' : ''}">Payroll</a>
	<a href="<c:url value='/summary'/>" class="${activeTab == 'summary' ? 'active' : ''}">Summary</a>
</nav>

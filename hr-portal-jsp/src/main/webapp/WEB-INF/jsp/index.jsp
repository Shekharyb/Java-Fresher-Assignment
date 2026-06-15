<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Infinite HR Portal</title>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
	<%@ include file="fragments/navtabs.jsp" %>
	<div class="content">
		<h2>Welcome</h2>
		<p>Use the tabs above to navigate between modules. The <strong>Summary</strong> tab shows a
			read-only quick-reference card with one key field from each module.</p>
	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<c:set var="scopeVarPage" value="Page Value" scope="page" />
<c:set var="scopeVarRequest" value="Request Value" scope="request" />
<c:set var="scopeVarSession" value="Session Value" scope="session" />
<c:set var="scopeVarApplication" value="Application Value"
	scope="application" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<table>
		<tr>
			<th>Scoped Variable</th>
			<th>Current Value</th>
		</tr>
		<tr>
			<td>Page Scope</td>
			<td>${scopeVarPage}</td>
		</tr>
		<tr>
			<td>Request Scope</td>
			<td>${scopeVarRequest}</td>
		</tr>
		<tr>
			<td>Session Scope</td>
			<td>${scopeVarSession}</td>
		</tr>
		<tr>
			<td>Application Scope</td>
			<td>${scopeVarApplication}</td>
		</tr>
	</table>
	<br></br>
	<jsp:include page="included.jsp" />
	<br></br>
	<a href="linked.jsp">Go to linked page</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Session</title>
</head>
<body>
	<ul>
		<li>Nom:${nom}</li>
		<li>Prenom:${prenom}</li>
		<li>Email:${email}</li>
		<li>Mdp:${password}</li>
		<li>Login:<c:out value="${login}"></c:out>
		</li>
		<a href="${pageContext.request.servletContext.contextPath}">go to roots!</a>
	</ul>
</body>
</html>
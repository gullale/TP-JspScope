<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Session</title>
</head>
<body>
	<hl>User object informations from session EL</hl>
	<ul>
		<li>login:${utilisateur.login}</li>
		<li>password:${utilisateur.password}</li>
	</ul>
</body>
</html>
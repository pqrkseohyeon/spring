<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>/sample/admin page</h1>
<p>principal : <sec:authentication property="principal"/></p>
<p>사용자아이디 : <sec:authentication property="principal.username"/></p>

<a href="/security11/customLogout">Logout</a>

</body>
</html>
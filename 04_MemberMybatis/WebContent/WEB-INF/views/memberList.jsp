<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="insert.my">추가하기</a> / 전체보기<br/><hr/>
<c:forEach items="${memberlist }" var="user">
이름 : ${user.name }<br/>
아이디 :<a href="view.my?id=${user.id}">${user.id }</a><br/>
주소 : ${user.addr }<br/>
메모 : ${user.memo }<br/>
날짜 : ${user.reg_date}<br/><br/>
</c:forEach>

</body>
</html>
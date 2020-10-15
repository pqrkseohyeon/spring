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
<a href="insert">추가하기</a> / 전체보기 <br/><hr/>
전체 회원 수 (${count})<hr/>
<c:forEach items="${userlist }" var="user">
이름 : ${user.name }<br/>
아이디 :<a href="view?id=${user.id}">${user.id }</a><br/>
성별 : ${user.gender }<br/>
직업 : ${user.job }<br/><br/>
</c:forEach>

<br/>
<form action="list">
	<select name="field">
		<option>선택하세요.</option>
		<option value="name">이름</option>
		<option value="id">아이디</option>
	</select>
	<input type="text" name="word">
	<input type="submit" value="검색">
</form>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상세보기</h3>
이름 : ${user.name }<br/>
아이디 :${user.id }<br/>
주소 : ${user.addr }<br/>
메모 : ${user.memo }<br/>
날짜 : ${user.reg_date }<br/><br/>
<input type="button" value="수정"
onclick="location.href='update.my?id=${user.id}'">
<input type="button" value="삭제"
onclick="location.href='delete.my?id=${user.id}'">
</body>
</html>
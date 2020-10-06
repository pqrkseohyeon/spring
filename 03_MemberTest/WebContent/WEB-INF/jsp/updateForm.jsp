<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>

<h2>개인 정보 수정</h2>

<form action="member_update.me" method="post">
<input type="hidden" name="id" value="${member. id}">

이름: <input type="text" name="name" value="${member.name }"><br>

아이디: ${user. id}<br>

패스워드 : <input type="password" name="password" value="${member.pass }"><br/>

주소 : <input type="text" name="addr" value="${member.addr }"><br/>

메모 : <input type="text" name="memo" value="${member.memo }"><br/>

<br><br>
<input type="submit" value="확인">
<input type="reset"  value="취소">
</form>
</body>
</html>
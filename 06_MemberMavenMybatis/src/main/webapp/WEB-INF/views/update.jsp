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

<form action="update" method="post">
<input type="hidden" name="id" value="${user.id}">

이름: <input type="text" name="name" value="${user.name }"><br>

아이디: ${user. id}<br>

패스워드 : <input type="password" name="pass" value="${user.pass }"><br/>

주소 : <input type="text" name="addr" value="${user.addr }"><br/>

메모 : <input type="text" name="memo" value="${user.memo }"><br/>


<br><br>
<input type="submit" value="확인">
<input type="reset"  value="취소">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>회원가입</h2>
<form action="member_insert.me" method="post">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="pass"></td>
	</tr>
	<tr>
		<td>성명</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input type="text" name="addr"></td>
	</tr>
	<tr>
		<td>메모</td>
		<td colspan="10"><input type="text" name="memo"></td>
	</tr>
	<tr><td colspan="2" align="center"><br/>
		<input type="submit" value="확인"/>
		<input type="reset" value="취소"/>
		</td>
		
	</tr>
	
</table>
</form>
</body>
</html>
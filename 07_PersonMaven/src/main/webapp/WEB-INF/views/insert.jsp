<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>개인 정보 입력</h2>
<form action="insert" method="post">


<table>
	<tr>
		<td>이름 :</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>아이디 :</td>
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>패스워드 :</td>
		<td><input type="password" name="password"></td>
	</tr>
	<tr>
		<td>성별 :</td>
		<td>
			<input type="radio" name="gender" value="남">남
			<input type="radio" name="gender" value="여">여
		</td>
	</tr>
	<tr>
		<td>직업 :</td>
		<td>
		<select name="job">
		<option value="회사원">회사원
		<option value="학생"> 학생
		<option value="기타"> 기타
		</select>
		</td>
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
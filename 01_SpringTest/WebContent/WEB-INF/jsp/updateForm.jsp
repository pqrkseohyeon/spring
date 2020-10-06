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
<form action="update.go" method="post">
<input type="hidden" name="id" value="${user.id}">

<table>
	<tr>
		<td>이름 :</td>
		<td><input type="text" name="name" value="${user.name}" ></td>
	</tr>
	<tr>
		<td>아이디 :</td>
		<td><input type="text" name="id" value="${user.id}"></td>
	</tr>
	<tr>
		<td>패스워드 :</td>
		<td><input type="password" name="password" value="${user.password}"></td>
	</tr>
	<tr>
		<td>성별 :</td>
		<td>
			<input type="radio" name="gender" value="남" id="man" checked>남
			<input type="radio" name="gender" value="여">여
		</td>
	</tr>
	<tr>
		<td>직업 :</td>
		<td>
		<select name="job" id="job">
		<option value="회사원">회사원
		<option value="학생"> 학생
		<option value="기타"> 기타
		</select>
		</td>
	</tr>
<script>
//성별
if("${user.gender}"=="남"){ //남자
	$("input:radio[value='남']").prop("checked",true);
}else{ //여자
	$("input:radio[value='여']").prop("checked",true);
}
//직업
$("#job option").each(function(){
	if($(this).val()=="${user.job}"){
		$(this).prop("selected",true);
	}
});
</script>
	<tr><td colspan="2" align="center"><br/>
		<input type="submit" value="확인"/>
		<input type="reset" value="취소"/>
		</td>
		
	</tr>
</table>
</form>
</body>
</html>
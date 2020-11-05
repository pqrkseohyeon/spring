<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h3>회원수정</h3>
<form> 

번호 : <input type="text" id="id" value="${member.id}" readonly="readonly"> <br/>
이름 : <input type="text"  id ="name" name="name" value="${member.name}"><br/>
주소 : <input type="text" id="addr" name="addr" value="${member.addr }"><br/><br/>
<button id="btnUpdate" type="button">글수정</button>
</form>
<script src="/js/member1.js"></script>
</body>
</html>
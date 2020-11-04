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
<h1>상세보기</h1>
번호 : <span id="id">${member.id}</span><br/>
이름 : ${member.name}<br/>
주소 : ${member.addr }<br/><br/>
<%-- <a href="${member.id}">삭제하기</a> --%>
<button id="btnDelete">삭제</button>

<script src="/js/member1.js"></script>
</body>
</html>
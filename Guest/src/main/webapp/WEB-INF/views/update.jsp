<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/resources/header.jsp" %>
<body>
<h3>회원 수정</h3>
<form>
    <div class="form-group">
    <br/>
      <label for="pwd">번호 : </label>
      <input type="text" class="form-control" value="${guest.id}" readonly="readonly" id="id">

    <br/>
      <label for="pwd">이름 : </label>
      <input type="text" class="form-control" value="${guest.name}" id="name" name="name">

    <br/>
      <label for="pwd">비밀번호 : </label>
      <input type="text" class="form-control" value="${guest.pwd}" id="pwd" name="pwd">

    <br/>
      <label for="pwd">이메일 : </label>
      <input type="text" class="form-control" value="${guest.email}" id="email" name="email">

    <br/>
      <label for="pwd">전화번호 : </label>
      <input type="text" class="form-control" value="${guest.phone}" id="phone" name="phone">

    <br/>
      <label for="pwd">주소 : </label>
      <input type="text" class="form-control" value="${guest.addr}" id="addr" name="addr">

    </div>
    <div align="center"> 
    	<button id="btnUpdate"  type="button" class="btn btn-success">수정 </button>
    </div>
          
</form>
<script src="/js/member1.js"></script>
</body>
</html>
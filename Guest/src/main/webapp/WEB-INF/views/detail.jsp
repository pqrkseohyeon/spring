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
    <div class="form-group">
    <br/>
      <label for="pwd">번호 : </label>
      <input type="text" class="form-control" value="${guest.id}" readonly="readonly">

    <br/>
      <label for="pwd">이름 : </label>
      <input type="text" class="form-control" value="${guest.name}" readonly="readonly">

    <br/>
      <label for="pwd">비밀번호 : </label>
      <input type="text" class="form-control" value="${guest.pwd}" readonly="readonly">

    <br/>
      <label for="pwd">이메일 : </label>
      <input type="text" class="form-control" value="${guest.email}" readonly="readonly">

    <br/>
      <label for="pwd">전화번호 : </label>
      <input type="text" class="form-control" value="${guest.phone}" readonly="readonly">

    <br/>
      <label for="pwd">주소 : </label>
      <input type="text" class="form-control" value="${guest.addr}" readonly="readonly">
    </div>
<div align="center">
<button id="btnDelete" class="btn btn-success">삭제 </button> ㅣ
<a href="${guest.id}/update"> 수정</a>
</div>
</form>
<script src="/js/member1.js"></script>
</body>
</html>
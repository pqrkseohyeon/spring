<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>회원가입</h2>
  <form action="join" method="post" >
  
    <div class="form-group">
      <label for="usr">아이디:</label>
      <input type="text" class="form-control" id="id" name="id">
    </div>
     <div class="col align-self-end">
    	 <button  type="button" id="idcheckBtn" class="btn btn-primary">중복확인</button>
    </div>
    <div class="form-group">
      <label for="pwd">비밀번호:</label>
      <input type="password" class="form-control" id="pass" name="pass">
    </div>
     <div class="form-group">
      <label for="usr">성명:</label>
      <input type="text" class="form-control" id="name" name="name">
    </div>
    <div class="form-group">
      <label for="usr">주소:</label>
      <input type="text" class="form-control" id="addr" name="addr">
    </div>
    <div class="form-group">
      <label for="usr">메모:</label>
      <textarea rows="10" cols="50" name="memo"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">회원가입</button>
  </form>
</div>

</body>
</html>

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
<body>

<div class="container">
  <br/><h2>회원가입</h2>
  <form action="gInsert" method="post"><br/>
  
    <div class="form-group">
      <label for="pwd">이름:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
    </div>
  	
    
    <div class="form-group">
      <label for="pwd">비밀번호:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div>
  	

  	  	
  	<div class="form-group">
      <label for="pwd">주소:</label>
      <input type="text" class="form-control" id="addr" placeholder="Enter address" name="addr">
    </div>
  	
    <div class="form-group">
      <label for="email">이메일:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    
    <div class="form-group">
      <label for="pwd">핸드폰:</label>
      <input type="text" class="form-control" id="phone" placeholder="Enter phone" name="phone">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>

</body>
</html>
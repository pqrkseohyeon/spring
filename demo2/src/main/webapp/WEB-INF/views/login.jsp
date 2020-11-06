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
<div class="container">
  <br/><br/><h2>로그인</h2><br/>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="usr">아이디:</label>
      <input type="text" class="form-control" id="id" name="id">
    </div>
    <div class="form-group">
      <label for="pwd">비밀번호:</label>
      <input type="password" class="form-control" id="pwd" name="pwd">
    </div>
    <button type="submit" class="btn btn-primary">로그인</button>
  </form>
</div>

</div>

</body>
<%@ include file="/resources/footer.jsp" %>
</html>
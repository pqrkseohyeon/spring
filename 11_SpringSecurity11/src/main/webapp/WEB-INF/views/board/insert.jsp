<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시판 글쓰기
<form action="boardInsert" method="post"><br/>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
작성자 : <input type="text" size="10" name="writer" id="username"
value='<sec:authentication property="principal.username"/>'>
<br/>
  <div class="form-group">
    <label for="password">비밀번호:</label>
    <input type="text"  id="password" name="password" class="form-control">
  </div>
  
  <div class="form-group">
    <label for="title">제목:</label>
    <input type="text" id="title" name="title" class="form-control">
  </div>
  
  <div class="form-group">
    <label for="content">내용:</label>
    <textarea class="form-control" rows="5" id="content" name="content"></textarea>
  </div>  
  
  <input type="submit" value="제출" class="btn btn-default">
</table>
</form>
</body>
</html>
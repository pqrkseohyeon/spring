<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/header.jsp" %>

<body>
<div class="container">
 <br/><br/><h3 align="center">게시글 작성</h3><br/><br/>
 <form action="/board/boardInsert" method="post">
 
  <div class="form-group">
    <label for="writer">작성자:</label>
    <input type="text" id="writer" name ="writer" class="form-control">
  </div>
  
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
    <textarea class="form-control" rows="10" id="content" name="content"></textarea>
  </div>  

  <button type="submit" class="btn btn-primary">게시글 등록</button>
 </form>
</div>
</body>
<%@ include file="/resources/footer.jsp" %>
</html>
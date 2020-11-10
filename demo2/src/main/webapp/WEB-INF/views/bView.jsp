<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/resources/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container"><br/>
	<div class="col-bg-6">
	<h3>글쓰기</h3>
	<form action="boardUpdate" method="post">
	<input type="hidden" value="${board.num}" id="num" name="num">
	  <div class="form-group">
	    <label for="writer">작성자:</label>
	    <input type="text" value="${board.writer}" id="writer" name ="writer" class="form-control" readonly="readonly">
	  </div>
	  
	  <div class="form-group">
	    <label for="title">제목:</label>
	    <input type="text" value="${board.title}" id="title" name ="title" class="form-control">
	  </div>
	
	  <div class="form-group">
	    <label for="content">내용:</label>
	    <textarea class="form-control" rows="5" id="content" name="content">${board.content}</textarea>
	  </div>
	
	  <div class="form-group">
	    <label for="password">비밀번호:</label>
	    <input type="text" value="${board.password}" id="password" name ="password" class="form-control">
	  </div>
	  
	  <input type="button" id="updateBtn" name="updateBtn" value="글수정" class="btn btn-primary">
	  <input type="button" id="deleteBtn" name="deleteBtn" value="글삭제"  class="btn btn-primary"><br/><br/>
	</form>
	</div><br/>
	
<!-- 댓글 쓰기 -->
  <div align="center" class="form-group">
	<form action="cInsert" method="post">
		<input type="hidden" value="${board.num}" id="num" name="num">
		<textarea class="form-control" rows="2" id="msg" name="msg"></textarea><br/>
		<input type="button" value="댓글쓰기" id="commentBtn" class="btn btn-primary">
	</form>
  </div>
<!-- 댓글 쓰기 끝-->

<!-- 댓글목록-->	
	<div>
	<c:forEach items="${board.comments}" var="bComments">
		<table class="table table-borderless">
			<tr>
				<td>${bComments.cnum}</td>
				<td>${bComments.content}</td>
				<td>${bComments.regdate}</td>
			</tr>
		</table>
	</c:forEach>
	</div>
	
	
	
	
	</div>
<script src="/js/board.js"></script>
	</body>
	</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/resources/header.jsp" %>
<body>
<div class="container">
  <br/><h2>글 목록</h2><br/>          
  <table class="table table-striped">
    <thead>
      <tr>
      	<th>번호</th>
        <th>작성자</th>
        <th>제목</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${blist.content}" var="board">    
      <tr>
      	<td>${board.num}</td>
      	<td>${board.writer}</td>
      	<td><a href="view/${board.num}">${board.title}</a></td>   
        <td>${board.hitcount}</td>

      </tr>
     </c:forEach> 
    </tbody>
  </table>
<div align="center">
  <a href="?page=${list.number-1}" align="center">이전</a>ㅣ
  <a href="?page=${list.number+1}" align="center">다음</a>
  </div>
</div>

</body>
<%@ include file="/resources/footer.jsp" %>

</html>
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
  <br/><h2>리스트</h2><br/>          
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>이메일</th>
        <th>핸드폰</th>
        <th>주소</th>
        <th>상세보기</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${list.content}" var="user">    
      <tr>
      	<td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.phone}</td>
        <td>${user.addr}</td>
        <td><a href="${user.id}">상세보기</a></td>
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
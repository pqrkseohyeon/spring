<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container" si><br/>
  <h3><a href="mInsert">추가</a></h3>
  <h3 align="center">리스트</h3><br/>

  <table class="table table-striped">
    <thead>
      <tr>
     	<th>번호</th>
        <th>이름</th>
        <th>주소</th>
        <th>상세보기</th>
        
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${list.content}" var="member">    
      <tr>
      	<td>${member.id}</td>
        <td>${member.name}</td>
        <td>${member.addr}</td>
        <td><a href="${member.id}">상세보기</a></td>
      </tr>
     </c:forEach> 

    </tbody>
  </table>
  
  <a class="page-link" href="?page=${list.number-1}" align="center">이전</a>
  <a class="page-link" href="?page=${list.number+1}" align="center">다음</a>
  
<%--   <c:choose>
  <c:when test="${list.first}">
  	<a class="page-link" href="?page=${list.number-1}">이전</a>
  </c:when>
  <c:otherwise>
  	<a class="page-link" href="?page=${list.number-1}">이전</a>
  </c:otherwise>
  </c:choose>
  
    <c:choose>
  <c:when test="${list.last}">
  	<a class="page-link" href="?page=${list.number+1}">다음</a>
  </c:when>
  <c:otherwise>
  	<a class="page-link" href="?page=${list.number+1}">다음</a>
  </c:otherwise>
  </c:choose> --%>
  </div>
  
  </body>
</html>
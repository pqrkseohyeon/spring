<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div align="center">총 게시물 수 : ${count}</div>
<table align="center" width="500px" border="1">
<tr align="center">
	<td>No_seq</td>
	<td>이름</td>
	<td>평가</td>
	<td>날짜</td>
	<td>삭제</td>
</tr>

<c:forEach items="${guestlist}" var="guest" varStatus="st">

	<tr align="center">
		<td>${guest.num}</td>
		<td><a href="javascript:fview(${guest.num})">${guest.name}</a></td>	
		<td>${guest.grade }</td>
		<td>${guest.created }</td>
		<a href="javascript:fdelete(${guest.num},'${guest.name}')">삭제</a>


	</tr>

</c:forEach>

</table>
<div align="center">
${pageHtml}
</div>
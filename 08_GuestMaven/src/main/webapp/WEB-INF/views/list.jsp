<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${guestlist}" var="guest">

번호:${guest.num}<br/>
이름: ${guest.name}<br/>
평가: ${guest.grade }<br/>
날짜: ${guest.created }<br/><hr/>
</c:forEach>
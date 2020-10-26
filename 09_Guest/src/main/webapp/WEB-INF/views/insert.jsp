<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="/myguest/resources/guest.js"></script>
</head>
<body>

<form method="post" action="gInsert">
<table  align="center" width=900px>
<tr>
		<td align="center">글쓴이</td> 
		<td>
		<input type="text" id="name" maxlength = 20 name="name">
	  </td>
</tr>
<tr>
<td align="center">내 용</td>
	<td>
	<input type="text" maxlength="70" id="content" name="content" >
	</td>
</tr>
<tr>
	<td align="center">평가 </td>
	<td><input type="radio" name="grade" value="excellent"
	checked="checked">아주잘함(excellent)
	<input type="radio" name="grade" value="good"> 잘함(good)
	<input type="radio" name="grade" value="normal"> 보통(normal)
	<input type="radio" name="grade" value="fail"> 노력(fail)
	</td>
</tr>
<br/>
<tr>
	<td colspan="2">
	<!-- type="button" id 속성 추가할 것 -->
 	<input type="button" value="입력" id="submit"> 
	</td>
</tr>
</table>
</form>
<br/><hr/>
<div  id="resultCount"></div>
<div id="resultArea">
<table border="1" align="center">
	<thead></thead>
	<tbody></tbody>
</table>
</div><br/>
<div id="pageArea" align="center"></div>

<br/><hr/>
<div id="viewArea" align="center"></div>


</body>
</html>
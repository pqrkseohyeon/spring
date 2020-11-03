<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h3>${board.writer}의 글</h3>

    <label for="num">글 번호 : ${board.num }</label><br/><br/>
    <label for="writer">작성자 : ${board.writer}</label><br/><br/>
    <label for="password">비밀번호 : ${board.password}</label><br/><br/>
    <label for="regdate">작성일 : ${board.regdate}</label><br/><br/>
    <label for="hitcount">조회수 : ${board.hitcount}</label><br/><br/>
    <label for="title">제목 : ${board.title}</label><br/><br/>
    <label for="content">내용 : ${board.content}</label><br/><br/>

  <input type="button" value="수정하기" class="btn btn-default"  onclick="location.href='update?num=${board.num}'" >
  <input type="button" value="삭제하기" class="btn btn-default"  onclick="location.href='boardDelete?num=${board.num}'" >

</div>
</body>
</html>
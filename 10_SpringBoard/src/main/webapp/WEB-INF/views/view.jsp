<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="boardInsert" method="post">
      <label>번호<label>
    <div class="form-group">
      <input type="text" size="20" id="num" name="num" value="${board.num}">
    </div>

      <label>글쓴이</label>
    <div class="form-group">
      <input type="text" size="20" id="writer" name="writer" value="${board.writer}">
    </div>
      <label>제목</label>
    <div class="form-group">
      <input type="text" size="37" id="title" name="title" value="${board.title}">
    </div>
      <label>내용</label>
    <div class="form-group">
      <input type="text" size="37" id="content" name="content" value="${board.content}">
    </div>
    <div class="form-group">
      <label>비밀번호</label>
      <input type="password" size="20" id="password" name="password" value="${board.password}" >
    </div>
    <br/>
		<input type="submit" value="수정">
		<input type="button" value="삭제">	
		<input type="reset" value="취소">
</form>
<div align="center">
<textarea rows="5" cols="50" id="msg"></textarea>
<input type="button" value="댓글쓰기" id="commentBtn">
</div>
<div id="area"></div>
<div id="commentResult"></div>
<script>

//댓글 리스트
var init=function(){
	$.ajax({
		type:"get",
		url:"/board/reply/commentList",
		data:{"num":$("#num").val()}
		})
		.done(function(resp){
			alert("성공:"+resp.length);
			var htmlCont=""; //테이블 내용
			$.each(resp,function(key,val){
				htmlCont+=val.content+"<br>";
				htmlCont+=val.regdate+"<br>";
				htmlCont+="<a href='javascript:fdel("+val.cnum+")'>삭제</a><hr>";
			/* $.each(resp,function(key,val){
				htmlCont+="<li data-cnum=>"+val.cnum+"</li>";
				htmlCont+"<div class='commentArea'>"
				htmlCont+=val.content+"<br>";
				htmlCont+=val.regdate+"<hr>";
				htmlCont+="<a>삭제</a><hr>";
				htmlCont+"</div>"*/
			
				})
				$("#area").html(htmlCont);//테이블 내용
		})
		.fail(function(error){
			alert("실패");
		})
}

//댓글추가
$("#commentBtn").on("click",function(){
	var data={
		bnum:$("#num").val(),
		content:$("#msg").val()
		}
		//alert(data);
	
	$.ajax({
		type:"post",
		url:"/board/reply/commentInsert",
		contentType:'application/json;charset=utf-8',
		data:JSON.stringify(data)
		
		})
		.done(function(){
			alert("등록 완료");
			init();
		})
		.fail(function(error){
			alert("등록 실패");
		})
	})
init();

//삭제하기
function fdelete(cnum){
	$.get("reply/delete",{"cnum":cnum},function(resp){
		if(resp=="success"){
			alert("삭제성공");
			init();
			}
		});
	}

//삭제하기 다른 방법
function fdel(cnum){
	$.ajax({
		type:'DELETE',
		url:"/board/reply/del/"+cnum,

		contentType:'application/json;charset=utf-8',
		})
		.done(function(resp){
			alert(resp+"글 삭제");
			init();
		})
		.fail(function(error){
			alert("글 삭제 실패");

			})			
	}


</script>
</body>
</html>
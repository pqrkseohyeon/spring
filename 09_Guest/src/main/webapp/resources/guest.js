$(function(){
 getData(1,"","");
});

//템플릿
function createHtmlStr(item){
	return` <tr>
			<td>${item.num}</td>
			<td><a href="javascript:fview(${item.num})">${item.name}</a></td>
			<td>${item.grade}</td>
			<td>${item.created}</td>
			<td><a href="javascript:fdelete(${item.num})">삭제</a></td>
		 </tr>
			
		`
}

function getData(pageNum, field, word){
	$.get("gList",
		{"pageNum":pageNum,"field":field,"word":word},
		function(resp){
			
			var countStr = "<div align='right'> 총 게시물 수:"+resp.count+"</div>";
			$("#resultCount").html(countStr);//개수
			
			var htmlTitle = "<table border=1><thead><tr>";
			htmlTitle+="<th>번호</th>";
			htmlTitle+="<th>이름</th>";
			htmlTitle+="<th>평가</th>";
			htmlTitle+="<th>날짜</th>";
			htmlTitle+="<th>삭제</th>";
			htmlTitle+="</tr></thead>";
			
		$("#resultArea thead").html(htmlTitle);// 테이블 타이틀
		
		var container = document.querySelector("#resultArea tbody");
		container.innerHTML=resp.list.map(item=>createHtmlStr(item)).join('').replace(/null/gi,"");

		$("#pageArea").html(resp.pageHtml);//페이징
		}	
	);//get
}//function

//상세보기
function fview(num){
	$.get("gView",
		{"num":num},
		function(resp){
			//resp = JSON.parse(resp);
			var htmlStr="";
			htmlStr+=resp.name+"<br>";
			htmlStr+=resp.grade+"<br>";
			htmlStr+=resp.content+"<br>";
			htmlStr+=resp.created+"<br>";
			htmlStr+=resp.ipaddr+"<br>";
			$("#viewArea").html(htmlStr);
			}
		);
}

//삭제하기
function fdelete(num){
	$.get("gDelete",
	{"num":num},
	function(resp){
		if(resp=="success"){
			alert("삭제성공");
			//getData(1,"","");
			location.href="/myguest";
		}
		
	});
}

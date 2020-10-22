$(function(){
 getData(1,"","");
});



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
		
		var htmlCont = "";//테이블 내용
		$.each(resp.list,function(key,val){
			htmlCont+=
			` <tr>
				<td>${val.num}</td>
				<td><a href="javascript:fview(${val.num})"${val.name}</a></td>
				<td>${val.grade}</td>
				<td>${val.created}</td>
				<td><a href="javascript:fdelete(${val.num})">삭제</a></td>
			 </tr>
			
			`
			
			
			
			
		/*	htmlCont+="<tr><td>"+val.num+"</td>";
			htmlCont+="<td><a href='javascript:fview("+val.num+")'>"+val.name+"</a></td>";
			htmlCont+="<td>"+val.grade+"</td>";
			htmlCont+="<td>"+val.created+"</td>";
			htmlCont+="<td><a href='javascript:fdelete("+val.num+")'>삭제</td></tr>";	*/
			
		});
		//$("#resultArea tbody").html(htmlCont);// 테이블 내용
		var container=document.querySelector("#resultArea tbody");
		container.innerHTML=htmlCont;
		
		
		
		
		$("#pageArea").html(resp.pageHtml);//페이징
		}	
	);//get
}//function

//상세보기
function fview(num){
	$.get("gView",
		{"num":num},
		function(resp){
			resp = JSON.parse(resp);
			var htmlStr="";
			htmlStr+=resp.name+"<br>";
			htmlStr+=resp.grade+"<br>";
			htmlStr+=resp.content+"<br>";
			htmlStr+=resp.created+"<br>";
			htmlStr+=resp.ipaddr+"<br>";
			$("#detailArea").html(htmlStr);
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

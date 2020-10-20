$(function(){
 getData(1,"","");
});

function getData(pageNum, field, word){
	$.get("gList",
		{"pageNum":pageNum,"field":field,"word":word},
		function(resp){
			alert(resp.list.length);	
		}
	);//get

}
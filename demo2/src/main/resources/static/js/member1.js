let user={
	init:function(){
		$("#btnDelete").on("click",()=>{
			this.delete();
		});
		$("#btnUpdate").on("click",()=>{
		this.update();
		});
	},
	
	update : function(){
		var dataParam={
			"name":$("#name").val(),
			"addr" : $("#addr").val(),
			"email" : $("#email").val(),
			"phone" : $("#phone").val(),
			"pwd" : $("#pwd").val(),
			"id"   : $("#id").val()
		}
		var id = $("#id").val();
		$.ajax({
			type:"PUT",
			url:"/update/"+id,
			data:JSON.stringify(dataParam),
			contentType:"application/json;charset=utf-8",
		})
		.done(function(resp){
			alert(resp+"번 수정 완료");
			location.href="/";
		})
		.fail(function(error){
		alert("error:"+error);
		})
		
	},
	delete:function(){
		alert("delete");
		$.ajax({
			type:"DELETE",
			url: $("#id").text()
		})
		.done(function(resp){
			alert(resp+"번 글이 삭제");
			location.href="/";
		})
		.fail(function(error){
			alert("error:"+error);
		})
	}
}
user.init();

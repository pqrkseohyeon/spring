let user={
	init:function(){
		$("#deleteBtn").on("click",()=>{
			this.delete();
		});
		$("#updateBtn").on("click",()=>{
		this.update();
		});
		$("#idCheckBtn").on("click", ()=>{
		this.idCheck();
		});
	},
	
	update : function(){
		var dataParam={
			"unum":$("#unum").val(),
			"userid" : $("#userid").val(),
			"password" : $("#password").val(),
			"name" : $("#name").val(),
			"addr" : $("#addr").val(),
			"email"   : $("#email").val(),
			"phone"   : $("#phone").val()
		}
		var unum = $("#unum").val();
		$.ajax({
			type:"PUT",
			url:"/update/"+unum,
			data:JSON.stringify(dataParam),
			contentType:"application/json;charset=utf-8",
		})
		.done(function(resp){
			alert(resp+"번 수정 완료");
			location.href="/list";
		})
		.fail(function(error){
		alert("error:"+error);
		})
		
	},
	delete:function(){
		var dataParam={
		    "unum":$("#unum").val(),
			"userid":$("#userid").val()		
		}
		$.ajax({
			type:"DELETE",
			url: "/delete/"+$("#unum").val(),
			data: JSON.stringify(dataParam),
			contentType:"application/json;charset=utf-8",
		})
		.done(function(resp){
			alert(resp+" 회원 삭제");
			location.href="/list";
		})
		.fail(function(error){
			alert("error:"+error);
		})
	}
}
user.init();

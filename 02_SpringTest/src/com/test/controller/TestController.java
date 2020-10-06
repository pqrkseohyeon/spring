package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //extends 역할을 해준다. 하나의 파일에 하나의 메소드로 만든다.
public class TestController {
	
	@RequestMapping("test.go")
	public String test() {
		return "result"; //result.jsp로 가라는 말
	}
	
	@RequestMapping("test22.go") //spring -> view(jsp)
	public String test22() {
		return "result22";
	}

}

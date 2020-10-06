package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //extends ������ ���ش�. �ϳ��� ���Ͽ� �ϳ��� �޼ҵ�� �����.
public class TestController {
	
	@RequestMapping("test.go")
	public String test() {
		return "result"; //result.jsp�� ����� ��
	}
	
	@RequestMapping("test22.go") //spring -> view(jsp)
	public String test22() {
		return "result22";
	}

}

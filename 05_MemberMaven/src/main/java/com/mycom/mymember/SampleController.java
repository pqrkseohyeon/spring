package com.mycom.mymember;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jdk.internal.org.jline.utils.Log;


@Controller
@RequestMapping("/sample/*")
public class SampleController {
	@RequestMapping("/")
	public void basic() {
		System.out.println("basic");
	}

}

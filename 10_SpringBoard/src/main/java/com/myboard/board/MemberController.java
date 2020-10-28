package com.myboard.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myboard.dto.MemberVO;
import com.myboard.model.MemberService;

@RequestMapping("/member/*")
@Controller
public class MemberController {
	@Autowired
	private MemberService mService;
	
	//회원가입
	@GetMapping("join")
	public String join(MemberVO member) {
		mService.join(member);
		return "join";
	}
	
//	// 로그인
//	@GetMapping("join")
//	public String join(HttpServletRequest request) {
//		HttpSession session = request.getSession();
//		return "join";
//	}
	

}

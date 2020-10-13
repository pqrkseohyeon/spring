package com.member.mytest;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.member.model.MemberService;
import com.member.model.MemberVO;
import com.mycom.model.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MemberService mService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "redirect:list";
	}
	
	//�߰���
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public void insert() {
		
	}
	
	//�߰��ϱ�
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(MemberVO member) {
		mService.insert(member);
		return "redirect:list";
		
	}
	
	//��ü����
	@RequestMapping("list")
	public String list(Model model) {
		List<MemberVO> memberlist = mService.list();
		model.addAttribute("memberlist",memberlist);
		return "memberList";
	}
	
	//�󼼺���, ������
	@RequestMapping(value = {"view","update"})
	public void view(Model model, String id) {
		MemberVO member = mService.view(id);
		model.addAttribute("user",member);
	}
	
	//�����ϱ�
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public String update(MemberVO member) {
		mService.update(member);
		return "redirect:list";
	}
	
	//�����ϱ�
	@RequestMapping("delete")
	public String delete(String id) {
		mService.delete(id);
		return "redirect:list";
	}
}

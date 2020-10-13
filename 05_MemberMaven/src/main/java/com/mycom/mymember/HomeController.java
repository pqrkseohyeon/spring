package com.mycom.mymember;

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

import com.mycom.model.Member;
import com.mycom.model.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MemberService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "redirect:list";
	}
	

	
	//�߰���
	//@RequestMapping(value = "insert", method = RequestMethod.GET)
	@GetMapping("insert")
	public void insert() {
		
	}
	
	//�߰��ϱ�
	//@RequestMapping(value = "insert", method = RequestMethod.POST)
	@PostMapping("list")
	public String insert(Member member) {
		service.insert(member);
		return "redirect:list";
		
	}
	
	//��ü����
	@RequestMapping("list")
	public String list(Model model,String field, String word) {
		field = field==null?"":field;
		word = word==null?"":word;
		List<Member> memberlist = service.list(field,word);
		model.addAttribute("memberlist",memberlist);
		return "memberList";
	
	}
	
	//�󼼺���, ������
	@RequestMapping(value = {"view","update"})
	public void view(Model model, String id) {
		Member member = service.findById(id);
		model.addAttribute("user",member);
	}
	
	//�����ϱ�
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public String update(Member member) {
		service.update(member);
		return "redirect:list";
	}
	
	//�����ϱ�
	@RequestMapping("delete")
	public String delete(String id) {
		service.delete(id);
		return "redirect:list";
	}
	
	
	
}

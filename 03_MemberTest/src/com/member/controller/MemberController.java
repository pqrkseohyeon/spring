package com.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.member.model.MemberDAOImpl;
import com.member.model.MemberDTO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAOImpl dao;
	
	//�߰���
	@RequestMapping(value="member_insert.me",method=RequestMethod.GET)
	public String insert() {
		return "memberForm";
	}
	
	//�߰�
	@RequestMapping(value="member_insert.me",method=RequestMethod.POST)
	public String insert(MemberDTO user) {
		dao.memberInsert(user);
		return "redirect:member_list.me";
	}
	
//	//��ü���� (ModelAndView  �̿���)
//	@RequestMapping("member_list.me")
//	public ModelAndView list() {
//		ModelAndView mv = new ModelAndView();
//		List<MemberDTO> memberlist = dao.getMemberList();
//		mv.addObject("memberlist",memberlist);
//		mv.setViewName("memberList");
//		dao.getMemberList();
//		return mv;
//		
//	}
	//��ü����(model �̿���)
	@RequestMapping("member_list.me")
	public String list(Model model) {
		List<MemberDTO> memberlist = dao.getMemberList();
		model.addAttribute("memberlist",memberlist);
		return "memberList";
		
	}
	
	//�󼼺���
	@RequestMapping("member_view.me")
	public ModelAndView view(String id) {
		MemberDTO member = dao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",member);
		mv.setViewName("memberView");
		return mv;
	}
	
	//���������� ����
	@RequestMapping(value="member_update.me",method=RequestMethod.GET)
	public String update(Model model, String id) {
		MemberDTO member = dao.findById(id);
		model.addAttribute("member",member);
		return "updateForm";
	}
	
	//�����ϱ�
	@RequestMapping(value="member_update.me",method=RequestMethod.POST)
	public String update(MemberDTO user) {
		dao.memberUpdate(user);
		return "redirect:member_list.me";
	}
	
	//�����ϱ�
	@RequestMapping("member_delete.me")
	public String delete(String id) {
		dao.delete(id);
		return "redirect:member_list.me";
		
	}

}

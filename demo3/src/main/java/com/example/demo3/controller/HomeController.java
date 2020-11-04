package com.example.demo3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo3.model.Member;
import com.example.demo3.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	private MemberService memberService;
	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	@GetMapping("mInsert")
	public String mInsert() {
		return "insert";
	}
	
	@PostMapping("mInsert")
	public String mInsert(Member member) {
		memberService.save(member);
		return "redirect:list";
	}
	@GetMapping("list")
	public String list(Model model) {
		List<Member> mlist = memberService.list();
		model.addAttribute("list",mlist);
		//model("list",memberService.list());
		return "list";
	}
	
	@GetMapping("{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("member",memberService.detail(id));
		return "detail";
	}
	
	@DeleteMapping("{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		memberService.delete(id);
		return id.toString();
	}

}

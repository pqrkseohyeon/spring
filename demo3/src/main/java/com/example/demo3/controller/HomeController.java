package com.example.demo3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	//추가 폼
	@GetMapping("mInsert")
	public String mInsert() {
		return "insert";
	}
	
	//추가하기
	@PostMapping("mInsert")
	public String mInsert(Member member) {
		memberService.save(member);
		return "redirect:list";
	}
	//전체보기(페이지 포함)
	@GetMapping("list")
	public String list(Model model, 
			@PageableDefault(size=3,sort="id",
			direction = Sort.Direction.DESC) Pageable pageable) {
		//List<Member> mlist = memberService.list();
		System.out.println("pageable:"+pageable);
		Page<Member> mlist = memberService.list(pageable);
		System.out.println(mlist.getNumber());
		model.addAttribute("list",mlist);
		//model("list",memberService.list());
		return "list";
	}
	
	//상세보기
	@GetMapping("{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("member",memberService.detail(id));
		return "detail";
	}
	
	//수정폼
	@GetMapping("{id}/update")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("member",memberService.detail(id));
		return "update";
	}
	
	//수정
	@PutMapping("update/{id}")
	@ResponseBody
	public String update(@PathVariable Long id, @RequestBody Member member) {
		System.out.println("addr:"+member.getAddr());
		System.out.println("id:"+member.getId());
		System.out.println("name:"+member.getName());
		memberService.update(member);
		return id.toString();
	}
	
	//삭제하기
	@DeleteMapping("{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		memberService.delete(id);
		return id.toString();
	}

}

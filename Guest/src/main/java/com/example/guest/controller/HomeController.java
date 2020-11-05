package com.example.guest.controller;

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

import com.example.guest.model.Guest;
import com.example.guest.service.GuestService;

@Controller
public class HomeController {
	@Autowired
	private GuestService guestService;
	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	//추가 폼
	@GetMapping("gInsert")
	public String gInsert() {
		return "insert";
	}
	
	//추가하기
	@PostMapping("gInsert")
	public String gInsert(Guest guest) {
		guestService.save(guest);
		return "redirect:list";
	}
	
	//전체보기(페이지 포함)
	@GetMapping("list")
	public String list(Model model,
			@PageableDefault(size=3,sort="id",
			direction = Sort.Direction.DESC) Pageable pageable) {
		Page<Guest> glist = guestService.list(pageable);
		model.addAttribute("list",glist);
		
		return "list";
	}
	
	//상세보기
	@GetMapping("{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("guest",guestService.detail(id));
		return "detail";
	}
	
	//수정폼
	@GetMapping("{id}/update")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("guest",guestService.detail(id));
		return "update";
	}
	
	//수정
	@PutMapping("update/{id}")
	@ResponseBody
	public String update(@PathVariable Long id, @RequestBody Guest guest) {
		guestService.update(guest);
		return id.toString();
	}
	
	
	//삭제하기
	@DeleteMapping("{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		guestService.delete(id);
		return id.toString();
	}
			
	
	

}

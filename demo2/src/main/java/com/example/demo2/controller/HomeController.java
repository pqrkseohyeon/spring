package com.example.demo2.controller;

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

import com.example.demo2.model.Board;
import com.example.demo2.model.User;
import com.example.demo2.repository.UserRepository;
import com.example.demo2.service.BoardService;
import com.example.demo2.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String index() {
		return "home";
	}
	
	//로그인 폼
	@GetMapping("uLogin")
	public String uLogin() {
		return "login";
	}
	//회원 추가폼
	@GetMapping("uInsert")
	public String bInsert() {
		return "join";
	}
	
	//회원추가
	@PostMapping("uInsert")
	public String uInsert(User user) {
		userService.save(user);
		return "redirect:list";
	}
	
	//회원 전체보기(페이지 포함)
	@GetMapping("list")
	public String list(Model model,
			@PageableDefault(size=3,sort="id",
			direction = Sort.Direction.DESC) Pageable pageable) {
		Page<User> ulist = userService.list(pageable);
		model.addAttribute("list",ulist);
		return "list";
	}
	
	//회원 상세보기
	@GetMapping("{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("user",userService.detail(id));
		return "detail";
	}
	
	// 회원 수정폼
	@GetMapping("{id}/update")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("user",userService.detail(id));
		return "update";
	}
	
	//회원 수정하기
	@PutMapping("update/{id}")
	@ResponseBody
	public String update(@PathVariable Long id, @RequestBody User user) {
		userService.update(user);
		return id.toString();
	}
	
	//회원 삭제하기
	@DeleteMapping("{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		userService.delete(id);
		return id.toString();
	}
	


	
	

}

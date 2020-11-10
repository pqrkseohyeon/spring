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
	
	@GetMapping("/")
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
	public String uInsert() {
		return "uInsert";
	}
	
	//회원가입
	@PostMapping("uInsert")
	public String uInsert(User user) {
		userService.save(user);
		return "redirect:list";
	}
	
	//회원 전체보기(페이지 포함)
	@GetMapping("list")
	public String list(Model model,
			@PageableDefault(size=3,sort="unum",
			direction = Sort.Direction.DESC) Pageable pageable) {
		Page<User> ulist = userService.list(pageable);
		model.addAttribute("list",ulist);
		return "uList";
	}
	
	//회원 상세보기 폼
	@GetMapping("{unum}")
	public String findByNum(@PathVariable Long unum, Model model) {
		model.addAttribute("user",userService.detail(unum));
		return "uDetail";
	}
	
	
	//회원 수정하기
	@PutMapping("update/{unum}")
	@ResponseBody
	public String update(@PathVariable Long unum, @RequestBody User user) {
		userService.update(user);
		String idStr = user.getUserid().toString();
		return idStr;
	}
	
	//회원 삭제하기
	@DeleteMapping("delete/{unum}")
	@ResponseBody
	public String delete(@PathVariable Long unum, @RequestBody User user) {
		userService.delete(unum);
		String idStr = user.getUserid().toString();
		return idStr;
	}
	
}

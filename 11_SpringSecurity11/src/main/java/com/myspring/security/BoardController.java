package com.myspring.security;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myspring.dto.BoardDTO;
import com.myspring.model.BoardServiceImpl;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	private BoardServiceImpl service;
	
	@GetMapping("/insert")
	@PreAuthorize("isAuthenticated()")//권한 검사
	public void register() {
		
	}
	
	//추가하기
	@PostMapping("boardInsert")
	public String insert(BoardDTO board) {
		service.insert(board);
		return "redirect:boardList";
		
	}
	//전체리스트
	@GetMapping("boardList")
	public String list(Model model, String field, String word) {
		HashMap<String,Object> hm = new HashMap<>();
		hm.put("field", field);
		hm.put("word", word);
		
		List<BoardDTO> list=service.findAll(hm);
		model.addAttribute("list",list);
		return "list";
	}
	
	//상세보기
	@GetMapping("get/{num}")
	public void get(@PathVariable("num") int num, Model model) {
		BoardDTO board = service.findByNum(num);
		model.addAttribute("board", board);
	}
	
	@GetMapping({"view","update"})
	public void view(Model model, int num) {
		BoardDTO board = service.findByNum(num);
		model.addAttribute("board", board);
	}	

	

}

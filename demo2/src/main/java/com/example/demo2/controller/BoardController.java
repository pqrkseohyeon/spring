package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.model.Board;
import com.example.demo2.service.BoardService;

@RequestMapping("/board")
@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	// 게시글 등록하기 폼
	@GetMapping("boardInsert")
	public String boardInsert() {
		return "board";
	}
	
	//게시글 등록하기
	@PostMapping("boardInsert")
	public String boardInsert(Board board) {
		boardService.save(board);
		return "board";
	}
	
	//게시글 목록보기
	@GetMapping("boardList")
	public String boardList(Model model,
			@PageableDefault(size=3,sort="id",
			direction = Sort.Direction.DESC) Pageable pageable) {
		Page<Board> blist = boardService.list(pageable);
		model.addAttribute("list",blist);
		return "list";
	}
	

	
	

}

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo2.model.Board;
import com.example.demo2.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	// 추가폼
	@GetMapping("boardInsert")
	public String boardInsert() {
		return "bInsert";
	}
	
	//게시글 추가하기
	@PostMapping("boardInsert")
	public String boardInsert(Board board) {
		boardService.boardSave(board);
		return "redirect:boardList";
	}
	
	//글목록
	@GetMapping("boardList")
	public String boardList(Model model,
			@PageableDefault(size=3,sort="num",
			direction = Sort.Direction.DESC) Pageable pageable) {
		Page<Board> blist = boardService.boardList(pageable);
		model.addAttribute("blist",blist);
		return "bList";
	}
	
	//글 상세보기
	@GetMapping("view/{num}")
	public String boardView(@PathVariable Long num, Model model) {
		model.addAttribute("board", boardService.boardView(num));
		return "bView";
	}
	
	
	//글 수정하기
	@PutMapping("view/{num}/update")
	@ResponseBody
	public String update(@PathVariable Long num, @RequestBody Board board) {
		boardService.boardUpdate(board);
		return num.toString();
	}
	
	//글 삭제하기
	@DeleteMapping("view/{num}/delete")
	@ResponseBody
	public String delete(@PathVariable Long num) {
		boardService.boardDelete(num);
		return num.toString();
	}

	
	

}

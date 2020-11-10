package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.dto.CommentDTO;
import com.example.demo2.model.Comment;
import com.example.demo2.service.CommentService;

@RequestMapping("/reply/")
@RestController
public class CommentController {
	@Autowired
	private CommentService cService;
	
	//댓글 쓰기
	@PostMapping("cInsert")
	public String commentInsert(@RequestBody CommentDTO comment) {
		cService.commentInsert(comment);
		return "success";
	}
	
	//댓글 목록 불러오기
	@GetMapping("cList")
	public List<Comment> commentList(Long bnum){
		List<Comment> clist = cService.CommentList(bnum);
		return clist;
	}

}

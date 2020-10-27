package com.myboard.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myboard.dto.CommentDTO;
import com.myboard.model.CommentService;


@RequestMapping("/reply/")
@RestController
public class CommentController {
	
	@Autowired
	private CommentService cService;
	
	@GetMapping("/commentList")
	@ResponseBody
	public List<CommentDTO> list(int num) {
		System.out.println("bnum:"+num);
		List<CommentDTO> clist = cService.getList(num);
		return clist;
	}
	
	//¥Ò±€√ﬂ∞°
	@PostMapping("/commentInsert")
	public String insert(@RequestBody CommentDTO cdto) {
		cService.insert(cdto);
		return "success";
	}

}

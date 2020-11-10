package com.example.demo2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo2.dto.CommentDTO;
import com.example.demo2.model.Comment;
import com.example.demo2.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

	private final CommentRepository commentRepository;
	
	//댓글 쓰기
	@Transactional
	public void commentInsert(CommentDTO comment) {
		commentRepository.commentInsert(comment.getBnum(), comment.getContent());
	}
	
	//댓글 목록
	@Transactional
	public List<Comment> CommentList(Long bnum){
		return commentRepository.findByBnum(bnum);
	}
}

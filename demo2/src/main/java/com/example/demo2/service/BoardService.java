package com.example.demo2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo2.model.Board;
import com.example.demo2.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;
	
	// 글 등록하기
	@Transactional
	public void save(Board board) {
		boardRepository.save(board);
	}
	
	//게시글 전체보기
	public List<Board> list(){
		return boardRepository.findAll();
	}
	
	//게시글 전체보기(페이지 포함)
	public Page<Board> list(Pageable pageable){
		return boardRepository.findAll(pageable);
	}
	
}

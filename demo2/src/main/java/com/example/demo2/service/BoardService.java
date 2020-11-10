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
	public void boardSave(Board board) {
		boardRepository.save(board);
	}
	
	//게시글 전체보기(페이지 포함)
	@Transactional
	public Page<Board> boardList(Pageable pageable){
		return boardRepository.findAll(pageable);
	}
	
	//게시글 상세보기
	@Transactional
	public Board boardView(Long num) {
		return boardRepository.findById(num)
				.orElseThrow(()->{
					return new IllegalArgumentException("게시글 보기 실패");
				});
	}
	
	// 글 수정하기
	@Transactional
	public void boardUpdate(Board board) {
		Board b = boardRepository.findById(board.getNum())
				.orElseThrow(()->{
					return new IllegalArgumentException("글수정 실패");
				});
		b.setContent(board.getContent());
		b.setPassword(board.getPassword());
		b.setTitle(board.getTitle());
	}
	
	//글삭제
	@Transactional
	public void boardDelete(Long num) {
		boardRepository.deleteById(num);
	}
	

	
}

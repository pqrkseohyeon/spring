package com.myspring.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myspring.dto.BoardDTO;
import com.myspring.mapper.BoardMapper;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private BoardMapper mapper;

	@Override
	public int dao_insert(BoardDTO board) {
		// TODO Auto-generated method stub
		return mapper.insert(board);
	}

	@Override
	public List<BoardDTO> dao_findAll(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return mapper.findAll(hm);
	}

	@Override
	public BoardDTO dao_findByNum(int num) {
		// TODO Auto-generated method stub
		return mapper.findByNum(num);
	}

	@Override
	public void dao_update(BoardDTO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dao_delete(int num) {
		// TODO Auto-generated method stub
		
	}

}

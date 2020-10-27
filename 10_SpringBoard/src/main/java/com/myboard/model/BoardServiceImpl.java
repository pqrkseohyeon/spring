package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myboard.dto.BoardDTO;
import com.myboard.util.SearchDTO;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO dao;

	//�߰�
	@Override
	public int insert(BoardDTO board) {
		return dao.dao_insert(board);
	}

	//��ü����
	@Override
	public List<BoardDTO> findAll(HashMap<String, Object> hm) {
		return dao.dao_findAll(hm);
	}

	
	@Override
	public BoardDTO findByNum(int num) {
		return dao.dao_findByNum(num);
	}

	@Override
	public void update(BoardDTO board) {
		dao.dao_update(board);
	}

	@Override
	public void delete(int num) {
		dao.dao_delete(num);
	}



	@Override
	public List<BoardDTO> findAll(SearchDTO dto) {
		// TODO Auto-generated method stub
		return dao.dao_findAll(dto);
	}

	@Override
	public int getCount(SearchDTO sdto) {
		// TODO Auto-generated method stub
		return dao.dao_getCount(sdto);
	}
}

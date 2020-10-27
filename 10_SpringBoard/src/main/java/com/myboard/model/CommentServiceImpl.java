package com.myboard.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myboard.dto.CommentDTO;
import com.myboard.mapper.CommentMapper;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper cmapper;

	@Override
	public List<CommentDTO> getList(int bnum) {
		// TODO Auto-generated method stub
		return cmapper.getList(bnum);
	}

	//´ñ±Û Ãß°¡
	@Override
	public void insert(CommentDTO cdto) {
		cmapper.insert(cdto);
		
	}

}

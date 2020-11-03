package com.myspring.model;

import java.util.HashMap;
import java.util.List;

import com.myspring.dto.BoardDTO;

public interface BoardDAO {
	//�߰�
	public int dao_insert(BoardDTO board);
	//����Ʈ
	public List<BoardDTO> dao_findAll(HashMap<String, Object> hm);
	//�󼼺���
	public BoardDTO dao_findByNum(int num);
	//����
	public void dao_update(BoardDTO board);
	//����
	public void dao_delete(int num);

}

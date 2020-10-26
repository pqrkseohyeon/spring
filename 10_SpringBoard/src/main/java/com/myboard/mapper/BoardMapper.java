package com.myboard.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.myboard.dto.BoardDTO;

public interface BoardMapper {
	@Insert("insert into springboard values(springboard_seq.nextval, #{title}, #{content}, #{writer}, sysdate, 0, #{password})")
	//�߰�
	public int insert(BoardDTO board);
	//��ü����
	public List<BoardDTO> findAll(HashMap<String, Object> hm);
	//�󼼺���
	public BoardDTO findByNum(int num);
	//����
	public void update(BoardDTO board);
	//����
	public void delete(int num);
	//����
	public int count(HashMap<String, Object> hm);
}

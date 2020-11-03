package com.myspring.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.myspring.dto.BoardDTO;

public interface BoardMapper {
	//�߰�
	@Insert("insert into springboard values"
			+ "(springboard_seq.nextval, #{title}, #{content}, #{writer}, sysdate, 1, #{password})")
	public int insert(BoardDTO board);
	//����Ʈ
	public List<BoardDTO> findAll(HashMap<String, Object> hm);
	//����
	public int count(HashMap<String, Object> hm);
	//�󼼺���
	@Select("select * from springboard where num=#{num}")
	public BoardDTO findByNum(int num);
	//����
	public void update(BoardDTO board);
	//����
	public void delete(int num);
	

}

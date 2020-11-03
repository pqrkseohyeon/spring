package com.myspring.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.myspring.dto.BoardDTO;

public interface BoardMapper {
	//추가
	@Insert("insert into springboard values"
			+ "(springboard_seq.nextval, #{title}, #{content}, #{writer}, sysdate, 1, #{password})")
	public int insert(BoardDTO board);
	//리스트
	public List<BoardDTO> findAll(HashMap<String, Object> hm);
	//갯수
	public int count(HashMap<String, Object> hm);
	//상세보기
	@Select("select * from springboard where num=#{num}")
	public BoardDTO findByNum(int num);
	//수정
	public void update(BoardDTO board);
	//삭제
	public void delete(int num);
	

}

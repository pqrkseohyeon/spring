package com.myboard.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.myboard.dto.MemberVO;

public interface MemberMapper {
	@Insert("insert into springmember values(#{id},#{pass},#{name},#{addr},#{memeo},sysdate)")
	//추가
	public int join(MemberVO member);
	//전체보기
	public List<MemberVO> list(HashMap<String, String> hm);
	//상세보기
	public MemberVO view(String id);
	//수정
	public void update(MemberVO member);
	//삭제
	public void delete(String id);
	

}

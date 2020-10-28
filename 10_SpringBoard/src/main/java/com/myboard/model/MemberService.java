package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import com.myboard.dto.MemberVO;

public interface MemberService {
	//추가
	public void join(MemberVO member);
	//전체보기
	public List<MemberVO> list(HashMap<String, String>hm);
	//상세보기
	public  MemberVO view(String id);
	//수정
	public void update(MemberVO member);
	//삭제
	public void delete(String id);

}

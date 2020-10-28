package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import com.myboard.dto.MemberVO;

public interface MemberDAO {
	//추가
	public int dao_join(MemberVO member);
	//리스트
	public List<MemberVO> dao_list(HashMap<String, String> hm);
	//상세보기
	public MemberVO dao_view(String id);
	//수정
	public void dao_update(MemberVO member);
	//삭제
	public void dao_delete(String id);

}

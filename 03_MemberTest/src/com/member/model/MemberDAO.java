package com.member.model;

import java.util.List;

public interface MemberDAO {
	//추가
	public void memberInsert(MemberDTO user);
	//전체보기
	public List<MemberDTO> getMemberList();
	//수정
	public void memberUpdate(MemberDTO user);
	//삭제
	public void delete(String id);
	//상세보기
	public MemberDTO findById(String id);

}

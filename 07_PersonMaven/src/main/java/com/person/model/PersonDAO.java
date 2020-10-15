package com.person.model;

import java.util.HashMap;
import java.util.List;

public interface PersonDAO {
	//추가
	public void dao_Insert(String sql_ID,PersonDTO person);
	//전체보기
	public List<PersonDTO> dao_findAll(String sql_ID,HashMap<String, String> hm);
	//상세보기
	public PersonDTO dao_findById(String sql_ID,String id);
	//수정
	public void dao_Update(String sql_ID,PersonDTO person);
	//삭제
	public void dao_Delete(String sql_ID,String id);
	//회원 수
	public int dao_count(String sql_ID);
}

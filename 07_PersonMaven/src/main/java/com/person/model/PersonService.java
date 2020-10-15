package com.person.model;

import java.util.HashMap;
import java.util.List;

public interface PersonService {
	//추가
	public void Insert(PersonDTO person);
	//전체보기
	public List<PersonDTO> findAll(HashMap<String, String> hm);
	//수정
	public void Update(PersonDTO person);
	//삭제
	public void Delete(String id);
	//상세보기
	public PersonDTO findById(String id);
	//count
	public int count();

}

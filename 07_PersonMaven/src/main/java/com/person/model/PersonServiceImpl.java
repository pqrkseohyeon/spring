package com.person.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO pDao;

	//추가
	@Override
	public void Insert(PersonDTO person) {
		pDao.dao_Insert("insertData", person);
		
	}

	//전체보기
	@Override
	public List<PersonDTO> findAll(HashMap<String, String> hm) {
		return pDao.dao_findAll("listData",hm);
	}

	//상세보기
	@Override
	public PersonDTO findById(String id) {
		return pDao.dao_findById("viewData", id);
	}
	
	// 수정하기
	@Override
	public void Update(PersonDTO person) {
		pDao.dao_Update("updateData", person);
		
	}

	//삭제하기
	@Override
	public void Delete(String id) {
		pDao.dao_Delete("deleteData", id);
		
	}

	//전체 회원 수 
	@Override
	public int count() {
		return pDao.dao_count("countData");
	}



}

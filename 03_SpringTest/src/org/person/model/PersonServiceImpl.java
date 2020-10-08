package org.person.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO dao;
	
	//추가하기
	@Override
	public void person_insert(PersonVO person) {
		dao.personInsert(person);
		
	}

	//수정하기
	@Override
	public void person_update(PersonVO person) {
		dao.personUpdate(person);
		
	}

	//삭제하기
	@Override
	public void person_delete(String id) {
		dao.personDelete(id);
		
	}

	//전체보기
	@Override
	public List<PersonVO> person_list() {
		// TODO Auto-generated method stub
		return dao.personList();
	}

	//상세보기
	@Override
	public PersonVO person_detail(String id) {
		// TODO Auto-generated method stub
		return dao.personDetail(id);
	}



}

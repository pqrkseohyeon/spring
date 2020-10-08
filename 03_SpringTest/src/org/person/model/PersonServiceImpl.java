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
	
	//�߰��ϱ�
	@Override
	public void person_insert(PersonVO person) {
		dao.personInsert(person);
		
	}

	//�����ϱ�
	@Override
	public void person_update(PersonVO person) {
		dao.personUpdate(person);
		
	}

	//�����ϱ�
	@Override
	public void person_delete(String id) {
		dao.personDelete(id);
		
	}

	//��ü����
	@Override
	public List<PersonVO> person_list() {
		// TODO Auto-generated method stub
		return dao.personList();
	}

	//�󼼺���
	@Override
	public PersonVO person_detail(String id) {
		// TODO Auto-generated method stub
		return dao.personDetail(id);
	}



}

package com.person.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO pDao;

	//�߰�
	@Override
	public void Insert(PersonDTO person) {
		pDao.dao_Insert("insertData", person);
		
	}

	//��ü����
	@Override
	public List<PersonDTO> findAll(HashMap<String, String> hm) {
		return pDao.dao_findAll("listData",hm);
	}

	//�󼼺���
	@Override
	public PersonDTO findById(String id) {
		return pDao.dao_findById("viewData", id);
	}
	
	// �����ϱ�
	@Override
	public void Update(PersonDTO person) {
		pDao.dao_Update("updateData", person);
		
	}

	//�����ϱ�
	@Override
	public void Delete(String id) {
		pDao.dao_Delete("deleteData", id);
		
	}

	//��ü ȸ�� �� 
	@Override
	public int count() {
		return pDao.dao_count("countData");
	}



}

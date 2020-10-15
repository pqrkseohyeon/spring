package com.person.model;

import java.util.HashMap;
import java.util.List;

public interface PersonService {
	//�߰�
	public void Insert(PersonDTO person);
	//��ü����
	public List<PersonDTO> findAll(HashMap<String, String> hm);
	//����
	public void Update(PersonDTO person);
	//����
	public void Delete(String id);
	//�󼼺���
	public PersonDTO findById(String id);
	//count
	public int count();

}

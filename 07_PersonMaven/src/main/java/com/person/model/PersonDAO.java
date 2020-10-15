package com.person.model;

import java.util.HashMap;
import java.util.List;

public interface PersonDAO {
	//�߰�
	public void dao_Insert(String sql_ID,PersonDTO person);
	//��ü����
	public List<PersonDTO> dao_findAll(String sql_ID,HashMap<String, String> hm);
	//�󼼺���
	public PersonDTO dao_findById(String sql_ID,String id);
	//����
	public void dao_Update(String sql_ID,PersonDTO person);
	//����
	public void dao_Delete(String sql_ID,String id);
	//ȸ�� ��
	public int dao_count(String sql_ID);
}

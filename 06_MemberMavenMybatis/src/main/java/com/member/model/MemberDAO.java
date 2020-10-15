package com.member.model;

import java.util.HashMap;
import java.util.List;

public interface MemberDAO {
	//�߰�
	public void dao_insert(String sql_Id, MemberVO member);
	//��ü����
	public List<MemberVO> dao_list(String sql_Id,HashMap<String, String> hm);
	//�󼼺���
	public MemberVO dao_view(String sql_Id,String id);
	//����
	public void dao_update(String sql_Id,MemberVO member);
	//����
	public void dao_delete(String sql_Id,String id);
}

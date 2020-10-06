package com.member.model;

import java.util.List;

public interface MemberDAO {
	//�߰�
	public void memberInsert(MemberDTO user);
	//��ü����
	public List<MemberDTO> getMemberList();
	//����
	public void memberUpdate(MemberDTO user);
	//����
	public void delete(String id);
	//�󼼺���
	public MemberDTO findById(String id);

}

package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import com.myboard.dto.MemberVO;

public interface MemberDAO {
	//�߰�
	public int dao_join(MemberVO member);
	//����Ʈ
	public List<MemberVO> dao_list(HashMap<String, String> hm);
	//�󼼺���
	public MemberVO dao_view(String id);
	//����
	public void dao_update(MemberVO member);
	//����
	public void dao_delete(String id);

}

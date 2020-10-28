package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import com.myboard.dto.MemberVO;

public interface MemberService {
	//�߰�
	public void join(MemberVO member);
	//��ü����
	public List<MemberVO> list(HashMap<String, String>hm);
	//�󼼺���
	public  MemberVO view(String id);
	//����
	public void update(MemberVO member);
	//����
	public void delete(String id);

}

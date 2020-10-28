package com.myboard.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.myboard.dto.MemberVO;

public interface MemberMapper {
	@Insert("insert into springmember values(#{id},#{pass},#{name},#{addr},#{memeo},sysdate)")
	//�߰�
	public int join(MemberVO member);
	//��ü����
	public List<MemberVO> list(HashMap<String, String> hm);
	//�󼼺���
	public MemberVO view(String id);
	//����
	public void update(MemberVO member);
	//����
	public void delete(String id);
	

}

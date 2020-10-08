package com.member.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO mDao;

	//�߰�
	@Override
	public void insert(MemberVO member) {
		mDao.dao_insert("insertData", member);
		
	}

	//��ü����
	@Override
	public List<MemberVO> list() {
		// TODO Auto-generated method stub
		return mDao.dao_list("listData");
	}

	//�󼼺���
	@Override
	public MemberVO view(String id) {
		// TODO Auto-generated method stub
		return mDao.dao_view("viewData", id);
	}

	//�����ϱ�
	@Override
	public void update(MemberVO member) {
		mDao.dao_update("updateData", member);
		
	}

	//�����ϱ�
	@Override
	public void delete(String id) {
		mDao.dao_delete("deleteData", id);
		
	}

}

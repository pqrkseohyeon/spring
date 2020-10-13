package com.mycom.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO mDao;
	
	//�߰�
	@Override
	public void insert(Member member) {
		mDao.dao_insert(member);
		
	}

	//��ü����
	@Override
	public List<Member> list(String field, String word) {
		// TODO Auto-generated method stub
		return mDao.dao_list(field,word);
	}

	//�󼼺���
	@Override
	public Member findById(String id) {
		// TODO Auto-generated method stub
		return mDao.dao_findById(id);
	}

	//�����ϱ�
	@Override
	public void update(Member member) {
		mDao.dao_update(member);
		
	}

	//�����ϱ�
	@Override
	public void delete(String id) {
		mDao.dao_delete(id);
		
	}

}

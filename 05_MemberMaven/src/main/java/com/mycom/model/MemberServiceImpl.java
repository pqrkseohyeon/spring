package com.mycom.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO mDao;
	
	//추가
	@Override
	public void insert(Member member) {
		mDao.dao_insert(member);
		
	}

	//전체보기
	@Override
	public List<Member> list(String field, String word) {
		// TODO Auto-generated method stub
		return mDao.dao_list(field,word);
	}

	//상세보기
	@Override
	public Member findById(String id) {
		// TODO Auto-generated method stub
		return mDao.dao_findById(id);
	}

	//수정하기
	@Override
	public void update(Member member) {
		mDao.dao_update(member);
		
	}

	//삭제하기
	@Override
	public void delete(String id) {
		mDao.dao_delete(id);
		
	}

}

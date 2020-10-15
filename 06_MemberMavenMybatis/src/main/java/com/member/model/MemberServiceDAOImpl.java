package com.member.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceDAOImpl implements MemberService {
	@Autowired
	private MemberDAO mDao;
	
	//추가
	@Override
	public void insert(MemberVO member) {
		mDao.dao_insert("insertData", member);
		
	}

	//전체보기
	@Override
	public List<MemberVO> list(HashMap<String, String> hm) {
		return mDao.dao_list("listData",hm);
	}

	//상세보기
	@Override
	public MemberVO view(String id) {
		return mDao.dao_view("viewData", id);
	}

	//수정하기
	@Override
	public void update(MemberVO member) {
		mDao.dao_update("updateData", member);
		
	}

	//삭제하기
	@Override
	public void delete(String id) {
		mDao.dao_delete("deleteData", id);
		
	}

}

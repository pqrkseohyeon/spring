package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myboard.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO mDao;

	@Override
	public void join(MemberVO member) {
		mDao.dao_join(member);
		
	}

	@Override
	public List<MemberVO> list(HashMap<String, String> hm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO view(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

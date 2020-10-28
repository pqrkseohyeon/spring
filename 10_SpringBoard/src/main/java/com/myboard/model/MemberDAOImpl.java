package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myboard.dto.MemberVO;
import com.myboard.mapper.MemberMapper;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private MemberMapper mMapper;

	@Override
	public int dao_join(MemberVO member) {
		// TODO Auto-generated method stub
		return mMapper.join(member);
	}

	@Override
	public List<MemberVO> dao_list(HashMap<String, String> hm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO dao_view(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dao_update(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dao_delete(String id) {
		// TODO Auto-generated method stub
		
	}

}

package com.guest.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guest.mapper.GuestMapper;
import com.guest.vo.GuestVO;
@Repository
public class GuestDAOImpl implements GuestDAO {
	@Autowired
	private GuestMapper mapper;

	@Override
	public void dao_insert(GuestVO guest) {
		mapper.insert(guest);
		
	}

	@Override
	public void dao_update(GuestVO guest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dao_delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GuestVO> dao_list(HashMap<String, Object> hm) {
		return mapper.list(hm);
	}

	@Override
	public GuestVO dao_findById(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int dao_count(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return 0;
	}

}

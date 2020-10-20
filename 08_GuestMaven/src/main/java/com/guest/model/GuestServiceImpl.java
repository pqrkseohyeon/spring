package com.guest.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guest.vo.GuestVO;

@Service
public class GuestServiceImpl implements GuestService {
	@Autowired
	private GuestDAO dao;

	@Override
	public void insert(GuestVO guest) {
		dao.dao_insert(guest);
		
	}

	@Override
	public void update(GuestVO guest) {
		// TODO Auto-generated method stub
		
	}

	//삭제하기
	@Override
	public void delete(int num) {
		dao.dao_delete(num);
		
	}

	@Override
	public List<GuestVO> list(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return dao.dao_list(hm);
	}

	@Override
	public GuestVO findById(int num) {
		// TODO Auto-generated method stub
		return dao.dao_findById(num);
	}

	@Override
	public int count(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return dao.dao_count(hm);
	}

}

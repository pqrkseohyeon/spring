package com.myguest.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestBookServiceImpl implements GuestBookService{
	@Autowired
	private GuestBookDAO dao;

	@Override
	public int guestInsert(GuestBookDTO gb) {
		// TODO Auto-generated method stub
		return dao.dao_guestInsert(gb);
	}

	@Override
	public List<GuestBookDTO> list(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return dao.dao_list(hm);
	}

	@Override
	public GuestBookDTO findByNum(int num) {
		// TODO Auto-generated method stub
		return dao.dao_findByNum(num);
	}

	@Override
	public void updateGuest(GuestBookDTO gb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGuest(int num) {
		// TODO Auto-generated method stub
		dao.dao_deleteGuest(num);
		
	}

	@Override
	public int countGuest(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return dao.dao_countGuest(hm);
	}


}

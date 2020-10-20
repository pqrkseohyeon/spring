package com.myguest.mapper;

import java.util.HashMap;
import java.util.List;

import com.myguest.model.GuestBookDTO;

public interface GuestBookMapper {
	//�߰�
	public void insert(GuestBookDTO gb);
	//��ü����
	public List<GuestBookDTO> list(HashMap<String, Object>hm);
	//����
	public void update(GuestBookDTO gb);
	
	//����
	public void delete(int num);
	
	//�󼼺���
	public GuestBookDTO findByNum(int num);
	//����
	public int count(HashMap<String, Object> hm);

}

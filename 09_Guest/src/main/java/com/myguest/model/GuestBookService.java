package com.myguest.model;

import java.util.HashMap;
import java.util.List;

public interface GuestBookService {
	//�߰�
	public int guestInsert(GuestBookDTO gb);
	//��ü����
	public List<GuestBookDTO> list(HashMap<String, Object>hm);
	//�󼼺���
	public GuestBookDTO findByNum(int num);
	//�����ϱ�
	public void updateGuest(GuestBookDTO gb);
	//����
	public void deleteGuest(int num);
	//����
	public int countGuest(HashMap<String, Object>hm);

}

package com.guest.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.guest.vo.GuestVO;

public interface GuestMapper {
	
	@Insert("insert into guestbook values(guestbook_seq.nextval,#{name},#{content},#{grade},sysdate,#{ipaddr})")
	public void insert(GuestVO guest);
	
	
	public List<GuestVO> list(HashMap<String, Object> hm);
	public int count(HashMap<String,Object> hm);
	//상세보기
	public GuestVO view(int num);
	public void delete(int num);
}

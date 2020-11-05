package com.example.guest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.guest.model.Guest;
import com.example.guest.repository.GuestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GuestService {
	
	private final GuestRepository guestRepository;

	//추가하기
	@Transactional
	public void save(Guest guest) {
		guestRepository.save(guest);
	}
	
	//전체보기
	public List<Guest> list(){
		return guestRepository.findAll();
	}
	
	//전체보기(페이지 포함)
	public Page<Guest> list(Pageable pageable){
		return guestRepository.findAll(pageable);
	}
	
	//상세보기
	public Guest detail(Long id) {
		return guestRepository.findById(id)
				.orElseThrow(()->{
					return new IllegalArgumentException("글 상세보기 실패: 아이디를 찾을 수 없습니다. ");
				});
	}
	
	//수정하기
	@Transactional
	public void update(Guest guest) {
		Guest g = guestRepository.findById(guest.getId())
		.orElseThrow(()->{
			return new IllegalArgumentException("찾기 실패: 아이디 없음");
		});
		g.setAddr(guest.getAddr());
		g.setName(guest.getName());
	}
	
	//삭제하기
	@Transactional
	public void delete(Long id) {
		guestRepository.deleteById(id);
	}
	
	
	
}

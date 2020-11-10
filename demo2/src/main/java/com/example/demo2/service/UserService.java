package com.example.demo2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo2.model.User;
import com.example.demo2.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
	//추가하기
	@Transactional
	public void save(User user) {
		userRepository.save(user);
	}
	
	//전체보기
	public List<User> list(){
		return userRepository.findAll();
	}
	
	//전체보기(페이지 포함)
	public Page<User> list(Pageable pageable){
		return userRepository.findAll(pageable);
	}
	
	//상세보기
	public User detail(Long unum) {
		return userRepository.findById(unum)
				.orElseThrow(() -> {
					return new IllegalArgumentException("회원 정보 불러오기 실패!");
				});
	}
	
	//수정하기
	@Transactional
	public void update(User user) {
		User u = userRepository.findById(user.getUnum())
		.orElseThrow(()->{
				return new IllegalArgumentException("수정실패");
		});
		u.setAddr(user.getAddr());
		u.setName(user.getName());
		u.setPassword(user.getPassword());
	}
	
	//삭제하기
	@Transactional
	public void delete(Long unum) {
		userRepository.deleteById(unum);
	}

}

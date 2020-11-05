package com.example.demo3.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo3.model.Member;
import com.example.demo3.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;
	
	
	//추가하기
	@Transactional
	public void save(Member member) {
		memberRepository.save(member);
	}
	
	// 전체보기
	public List<Member> list(){
		return memberRepository.findAll();
	}
	
	//전체보기(페이지 포함)
	public Page<Member> list(Pageable pageable){
		return memberRepository.findAll(pageable);
	}
	
	
	//수정
	@Transactional
	public void update(Member member) {
		Member m = memberRepository.findById(member.getId())
		.orElseThrow(()->{
			return new IllegalArgumentException("찾기 실패: 아이디 없음");
		});
		m.setAddr(member.getAddr());
		m.setName(member.getName());
		
	}
	

	//상세보기
	public Member detail(Long id) {
		return memberRepository.findById(id)
				.orElseThrow(()->{
					return new IllegalArgumentException("글 상세보기 실패: 아이디를 찾을 수 없습니다. ");
				});
	}
	
	//삭제하기
	@Transactional
	public void delete(Long id) {
		memberRepository.deleteById(id);
	}

}

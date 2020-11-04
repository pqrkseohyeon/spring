package com.example.demo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity // 테이블을 만들어준다.
public class Member {// 클래스명이 테이블명  
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@Column(name = "address")
	private String addr;

}

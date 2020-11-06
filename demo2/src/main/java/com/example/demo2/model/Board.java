package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Board {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long num;
	private String writer;
	private String subject;
	private String email;
	private String content;
	private int readcount;
	private String pwd;
	private String reg_date;
	


}
package com.example.demo2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Board {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long num;
	private String content;
	private String title;
	private String writer;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="reg_date")
	private Date regdate;
	
	private Long hitcount;
	private String password;
	private Long replycnt;
	


}
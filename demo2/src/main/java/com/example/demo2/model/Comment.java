package com.example.demo2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Comment {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cnum;
	private String userid;
	private String content;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date regdate;
	
	@ManyToOne
	@JoinColumn(name="bnum")
	private Board board;

}


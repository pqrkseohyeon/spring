package com.example.demo2.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class Board {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	private String content;
	private String title;
	private String writer;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="regdate")
	private Date regdate;
	
	private Long hitcount;
	
	@PrePersist
	public void prePersist() {
		this.hitcount= this.hitcount==null? 0:this.hitcount;
	}
	private String password;
	private Long replycnt;
	
	
	@OneToMany(mappedBy = "board", fetch = FetchType.EAGER)	  
	@JsonIgnoreProperties("board") 
	private List<Comment> comments;
	 
	


}
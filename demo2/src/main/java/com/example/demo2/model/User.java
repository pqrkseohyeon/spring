package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long unum;
	private String userid;
	private String password;
	private String name;
	private String addr;
	private String email;
	private String phone;


}

package com.example.guest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Guest {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@Column(name = "password")
	private String pwd;
	@Column(name = "address")
	private String addr;
	private String email;
	private String phone;

}

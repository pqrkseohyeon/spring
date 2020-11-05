package com.example.demo3.model; 

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="tbl_user")
public class User {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String userName;
	private String nickName;
	private String address;
	@OneToMany(mappedBy = "user")
	private List<Order> orders;

}

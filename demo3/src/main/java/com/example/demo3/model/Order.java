package com.example.demo3.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tbl_order")
public class Order {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private String orderName;
	private String note;
	private int price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

}

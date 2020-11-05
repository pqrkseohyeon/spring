package com.example.demo3.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "hotel_review")
public class Review{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;
	private int rate;
	private String commnet;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rating_date")
	private Date ratingDate;

	
}

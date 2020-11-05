package com.example.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.guest.service.GuestService;

@Controller
public class HomeController {
	@Autowired
	private GuestService guestService;
	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	

}

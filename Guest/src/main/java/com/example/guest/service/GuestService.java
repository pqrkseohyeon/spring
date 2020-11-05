package com.example.guest.service;

import org.springframework.stereotype.Service;

import com.example.guest.repository.GuestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GuestService {
	
	private final GuestRepository guestRepository;

}

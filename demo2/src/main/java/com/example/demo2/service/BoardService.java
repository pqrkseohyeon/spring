package com.example.demo2.service;

import org.springframework.stereotype.Service;

import com.example.demo2.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;
	
}

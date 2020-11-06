package com.example.mysql;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;


public class mysqlTest1 {
	 private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	 private static final String URL = "jdbc:mysql://127.0.0.1:3306/test1?serverTimezone=UTC"; // jdbc:mysql://127.0.0.1:3306/생성한 스키마이름
	 private static final String USER = "root"; //DB 사용자명
	 private static final String PW = "1234";   //DB 사용자 비밀번호

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println("성공");
			System.out.println(con);
		}catch(Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
	
	}

}

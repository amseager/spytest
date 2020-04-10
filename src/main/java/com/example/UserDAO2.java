package com.example;

import java.sql.Connection;

public class UserDAO2 {

	public Connection getConnFromPool(int i) {
		throw new RuntimeException();
	}

	public User readByUserid(String s) {
		System.out.println("In DAO 2");
		Connection c = getConnFromPool(1);
		return new User();
	}
}

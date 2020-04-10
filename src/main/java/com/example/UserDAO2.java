package com.example;

import javax.ejb.Stateless;
import java.sql.Connection;

@Stateless
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

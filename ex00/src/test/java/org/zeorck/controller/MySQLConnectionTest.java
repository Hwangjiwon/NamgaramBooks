package org.zeorck.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String Driver = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/namgaram?useSSL=false";
	private static final String USER = "namgaram";
	private static final String PW = "namgaram";
	@Test
	public void testConnection() throws Exception{
		Class.forName(Driver);

		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

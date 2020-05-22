package com.weather03.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {

	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=weather;";
		String user = "sa"; // DB ID
		String password = "0000"; // DB Password

		try { // 데이터베이스에 접속합니다.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("1. driver connect");
		} catch (ClassNotFoundException e) {
			System.out.println("1. driver error");
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			System.out.println("2. user connect");
		} catch (SQLException e) {
			System.out.println("2. user error");
			e.printStackTrace();
		}

		return con;
	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public static void close(ResultSet rs, PreparedStatement pstm, Connection con) {
		try {
			rs.close();
			pstm.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(PreparedStatement insert_pstm, Connection con) {
		try {
			insert_pstm.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestPost {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "blackthorne");
		System.out.println("Connection is created");

		String query = "insert into posts values(564,'Title of the post','Body of the post')";
		Statement st = con.createStatement();

		int res = st.executeUpdate(query);
		System.out.println("Rows affected : " + res);
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter post id");
//		int id = scan.nextInt();
//
//		scan.nextLine();
//		System.out.println("Enter post title");
//		String title = scan.nextLine();
//
//		System.out.println("Enter post body");
//		String body = scan.nextLine();
//
//		String sql = "insert into posts values(?,?,?)";
//		PreparedStatement pst = con.prepareStatement(sql);
//		pst.setInt(1, id);
//		pst.setString(2, title);
//		pst.setString(3, body);
//		int i = pst.executeUpdate();
//
//		System.out.println("Rows affected : " + i);
//
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select * from posts");
//
//		while (rs.next()) {
//			System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3));
//		}
	}
}
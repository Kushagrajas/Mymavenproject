package com.example.mavenprojectdemo;
import java.sql.*;
public class Proj {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kj", "root", "root");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into emp values(3, 'ddd', 'fff');");
			ResultSet rs=stmt.executeQuery("select *from emp");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}

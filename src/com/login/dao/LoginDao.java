package com.login.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao 
{
	String sql= "Select * from login where username=? and pass=?";
	String url="jdbc:mysql://localhost:3306/welcome";
	String username="root";
	String password="Welcome123";
	
	public boolean check(String uname,String pass)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,username,password);
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}

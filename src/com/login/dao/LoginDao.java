package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao 
{
	String sql= "Select * from login where username=? and pass=?";
	String sq="Select username from login";
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
	public String[] show() throws SQLException {
		String s[]= new String[100];int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,username,password);
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(sq);
			while(rs.next())
			{
				s[i]=rs.getString("username");
				i++;
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return(s);
	}
}

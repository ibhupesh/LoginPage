package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		String sq="insert into login values (?,?)";
		String url="jdbc:mysql://localhost:3306/welcome";
		String username="root";
		String password="Welcome123";
		PrintWriter out= response.getWriter();
	
		out.println("<body text=\"orange\" bgcolor=\"black\"><center><h1>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,username,password);
			PreparedStatement st= con.prepareStatement(sq);
			st.setString(1, uname);
			st.setString(2, pass);
			st.executeUpdate();
			out.println("Congratulations! "+uname+" <br>You are successfully added as New User");
			System.out.println("User Added");
			out.println("</h1></center></body>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

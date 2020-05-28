package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Show")
public class Show extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String sq="Select username from login";
		String url="jdbc:mysql://localhost:3306/welcome";
		String username="root";
		String password="Welcome123";
			String s;int i=1;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection(url,username,password);
				Statement st= con.createStatement();
				ResultSet rs= st.executeQuery(sq);
				
				PrintWriter out=response.getWriter();
				response.setContentType("text/html");
				out.println("<body text=\"Black\" bgcolor=\"pink\">");
				out.println("<center>");
				
				out.println("<h1>THE REGISTERED USERS </h1>");
				while(rs.next())
				{
					s=rs.getString("username");
					out.println("<h2>"+i+" "+s);
					i++;
				}
				out.println("<form action=\"adduser.jsp\" >\r\n" + 
						"		<input type=\"submit\" value=\"Add New\">\r\n" + 
						"	</h2></form></center>");
				out.println("</body>");
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
	}
}

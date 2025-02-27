package com.servlets;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@WebServlet("/Udisplaydata")
/**
 * Servlet implementation class Udisplaydata
 */
public class Udisplaydata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Udisplaydata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		try {
			Connection cons=Dbconnection.connect();
			String query="select * from demo";
			PreparedStatement ps=cons.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			pw.print("<table border=2>");
			pw.print("<tr>");
			pw.print("<th>User name</th>");
			pw.print("<th>email</th>");
			pw.print("<th>mobile</th>");
			pw.print("<th>gender</th>");
			pw.print("<th>delete</th>");
			pw.print("<th>edit</th>");
			pw.print("</tr>");
			while(rs.next()) {
				pw.print("<tr>");
				pw.print("<td>"+rs.getString(1)+"</td>");
				pw.print("<td>"+rs.getString(3)+"</td>");
				pw.print("<td>"+rs.getString(4)+"</td>");
				pw.print("<td>"+rs.getString(5)+"</td>");
				pw.print("<td>"+"<a href='Deletedata'>delete</a>"+"</td>");
				pw.print("<td>"+"<a href='Editdata'>edit</a>"+"</td>");
				pw.print("</tr>");
			}
			pw.print("</table>");
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}

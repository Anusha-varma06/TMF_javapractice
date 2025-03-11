package com.servlets;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
@WebServlet("/Deletedata")
/**
 * Servlet implementation class Deletedata
 */
public class Deletedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deletedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		try {
			Connection cons=Dbconnection.connect();
			String name=(String)request.getParameter("uname");
			String query="delete from demo where name=?";
			PreparedStatement ps=cons.prepareStatement(query);
			ps.setString(1,name);
			int res=ps.executeUpdate();
			if(res>0) {
				RequestDispatcher rd=request.getRequestDispatcher("Udisplaydata");
				rd.forward(request, response);
			}
			else {
				pw.write("something went wrong");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package com.mysqldatabaseconnectivity;
import java.sql.*;
public class Connectionsetup{
	public static Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
}

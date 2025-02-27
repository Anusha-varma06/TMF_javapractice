package com.daoanddto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Daoimplementation implements Employeedao {
	Connection cons;
     public void addemployee(Employeedto eob) throws Exception {
    	 cons=Dbconnection.connect();
    	 String query="insert into employee values(?,?)";
    	 PreparedStatement ps=cons.prepareStatement(query);
    	 ps.setInt(1,eob.getid());
    	 ps.setString(2,eob.getname());
    	 int res=ps.executeUpdate();
     }
     public void viewemployeedata() throws Exception{
    	 cons=Dbconnection.connect();
    	 String query="select * from employee";
    	 PreparedStatement ps=cons.prepareStatement(query);
    	 ResultSet rs=ps.executeQuery();
    	 while(rs.next()) {
    		 System.out.println(rs.getInt("id")+" "+rs.getString("name"));
    	 }
     }
     public void updateemployee(Employeedto eob) throws Exception{
    	 cons=Dbconnection.connect();
    	 String query="update employee set name=? where id=?";
    	 PreparedStatement ps=cons.prepareStatement(query);
    	 ps.setString(1,"john");
    	 ps.setInt(2,eob.getid());
    	 int res=ps.executeUpdate();
    	 viewemployeedata();
     }
     public static void main(String args[]) throws Exception {
    	 Daoimplementation ob=new Daoimplementation();
    	 Employeedto eob=new Employeedto(102,"cherry");
    	 ob.addemployee(eob);
    	 ob.viewemployeedata();
    	 ob.updateemployee(eob);
     }
}

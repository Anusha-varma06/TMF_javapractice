package com.mysqldatabaseconnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Owner {
	Connection cons=Connectionsetup.connect();
   void addmenu(String item,int price)throws Exception {
	   String query="insert into menu(item_name,price) values(?,?)";
	   PreparedStatement ps=cons.prepareStatement(query);
	   ps.setString(1, item);
	   ps.setInt(2, price);
	   int res=ps.executeUpdate();
   }
   void display() throws Exception {
	   String query="select * from menu";
	   PreparedStatement ps=cons.prepareStatement(query);
	   ResultSet rs=ps.executeQuery();
   }
   void removeitem(String item) throws Exception{
	   String query="delete from menu where item_name=?";
	   PreparedStatement ps=cons.prepareStatement(query);
	   ps.setString(1, item);
	   int res=ps.executeUpdate();
	   System.out.println("menu after removal");
	   display();
	   
   }
}

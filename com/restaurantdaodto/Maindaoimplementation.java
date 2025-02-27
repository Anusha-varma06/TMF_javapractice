package com.restaurantdaodto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
class Customerdaoimp implements Customerdao{
	Connection cons;
	public void orderitems(Customerdto cdto) throws Exception{
		cons=Dbconnection.connect();
		String query1="select * from menu where item_name=?";
		PreparedStatement ps1=cons.prepareStatement(query1);
		ps1.setString(1,cdto.getitem());
		ResultSet rs=ps1.executeQuery();
		if(rs!=null) {
		String query="insert into orders (item,quantity) values(?,?)";
		PreparedStatement ps=cons.prepareStatement(query);
		ps.setString(1,cdto.getitem());
		ps.setInt(2, cdto.getquantity());
		int res=ps.executeUpdate();
	    }
	}
	public void updateorder(String itemch,int qc)throws Exception {
		cons=Dbconnection.connect();
		String query="update orders set quantity=? where item=?";
		PreparedStatement ps=cons.prepareStatement(query);
		ps.setInt(1,qc);
		ps.setString(2, itemch);
		int res=ps.executeUpdate();
	}
	public void generatebill()throws Exception {
		cons=Dbconnection.connect();
		String query="select sum(menu.price*orders.quantity) as totalbill from menu inner join orders on menu.item=orders.item";
		PreparedStatement ps=cons.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("Total bill:"+rs.getInt(1));
		}
	}
}
class Ownerdaoimp implements Ownerdao{
	Connection cons;
	public void additemsmenu(Ownerdto odto) throws Exception {
		cons=Dbconnection.connect();
		String query="insert into menu (item,price) values(?,?)";
		PreparedStatement ps=cons.prepareStatement(query);
		ps.setString(1,odto.getitem());
		ps.setInt(2, odto.getprice());
		int res=ps.executeUpdate();
	}
	public void menudisplay() throws Exception{
		cons=Dbconnection.connect();
		String query="select * from menu";
		PreparedStatement ps=cons.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("item")+" "+rs.getInt("price"));
		}
		
	}
	public void removeitemsmenu(String name) throws Exception{
		cons=Dbconnection.connect();
		String query="delete from menu where item=?";
		PreparedStatement ps=cons.prepareStatement(query);
		ps.setString(1,name);
		int res=ps.executeUpdate();
		menudisplay();
	}
}
public class Maindaoimplementation {
       public static void main(String args[])throws Exception {
    	   Scanner sc=new Scanner(System.in);
    	   Ownerdaoimp ownob=new Ownerdaoimp();
    	   Customerdaoimp cusob=new Customerdaoimp();
    	   
    	   System.out.println("Welcome owner");
    	   System.out.println("How many items you want to add?");
    	   int num=sc.nextInt();
    	   for(int i=0;i<num;i++) {
    		   sc.nextLine();
    		   System.out.println("Enter item:");
        	   String name=sc.nextLine();
        	   System.out.println("Enter price:");
        	   int p=sc.nextInt();
    		   Ownerdto odto=new  Ownerdto(name,p);
    		   ownob.additemsmenu(odto);
    	   }
    	   System.out.println("Items added in the menu");
    	   System.out.println("displaying menu:");
    	   ownob.menudisplay();
    	   System.out.println("which item you want to remove?");
    	   sc.nextLine();
    	   String name=sc.nextLine();
    	   ownob.removeitemsmenu(name);
    	   System.out.println("welcome customer");
    	   System.out.println("How many items you want to order?");
    	   int no=sc.nextInt();
    	   for(int i=0;i<no;i++) {
    		   sc.nextLine();
    		   System.out.println("Enter item:");
        	   String name1=sc.nextLine();
        	   System.out.println("Enter quantity:");
        	   int q=sc.nextInt();
        	   Customerdto cdto=new Customerdto(name1,q);
    		   cusob.orderitems(cdto);
    	   }
    	   System.out.println("ordered successfully");
    	   System.out.println("Enter the item and the qunatity you want to update");
    	   sc.nextLine();
    	   String itemch=sc.nextLine();
    	   int qc=sc.nextInt();
    	   cusob.updateorder(itemch,qc);
    	   cusob.generatebill();
    	   String del="truncate table orders";
    	   PreparedStatement ps=cusob.cons.prepareStatement(del);
       	   int i=ps.executeUpdate();
       	   if(i>0) {
       		   System.out.println("database cleared");
       	   }
       }
}

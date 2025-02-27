package com.mysqldatabaseconnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Customers extends Owner{
	Connection cons=Connectionsetup.connect();
	PreparedStatement ps;
	void additems(String item,int quantity)throws Exception {
		String query="select * from menu where item_name=?";
		ps=cons.prepareStatement(query);
		ps.setString(1,item);
		ResultSet rs=ps.executeQuery();
		if(rs!=null) {
			query="insert into orders(item_name,quantity) values(?,?)";
			ps=cons.prepareStatement(query);
			ps.setString(1,item);
			ps.setInt(2, quantity);
			int i=ps.executeUpdate();
			if(i>0)
				System.out.println("order placed succesfully");
		}
	}
	void generatebill()throws Exception{
		String query="select sum(menu.price*orders.quantity) as totalbill from menu inner join orders on menu.item_name=orders.item_name";
		ps=cons.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("Total bill:"+rs.getInt(1));
		}
	}
	public static void main(String args[]) throws Exception {
		// TODO Auto-generated method stub
       Customers cs=new Customers();
       Scanner sc=new Scanner(System.in);
       int icount;
       String item;
       int price;
       int quantity;
       System.out.println("Welcome Owner");
   	   System.out.println("How many items do you wanna add?");
   	   icount=sc.nextInt();
   	for(int i=0;i<icount;i++) {
		sc.nextLine();
		System.out.println("Enter item");
		item=sc.nextLine();
		System.out.println("Enter its price");
		price=sc.nextInt();
		cs.addmenu(item,price);
   	}
		System.out.println("Items added successfully");
    	System.out.println("Welcome customer");
    	cs.display();
    	System.out.println("How many items do you wanna order?");
    	icount=sc.nextInt();
    	for(int i=0;i<icount;i++) {
    		sc.nextLine();
    		System.out.println("Enter item");
    		item=sc.nextLine();
    		System.out.println("Enter its quantity");
    		quantity=sc.nextInt();
    		cs.additems(item,quantity);
    	}
    	System.out.println("Items ordered successfully");
    	System.out.println("generating bill");
    	cs.generatebill();
    	String del="truncate table orders";
    	cs.ps=cs.cons.prepareStatement(del);
    	int i=cs.ps.executeUpdate();
    	
	}
	}
	


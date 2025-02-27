package com.restaurantdaodto;
public class Ownerdto {
	private String item;
	private int price;
     Ownerdto(String item,int price){
    	 this.item=item;
    	 this.price=price;
     }
     public void setitem(String item) {
   	  this.item=item;
     }
     public void setprice(int price) {
   	  this.price=price;
     }
     public String getitem() {
   	  return item;
     }
     public int getprice() {
   	  return price;
     }
     
}

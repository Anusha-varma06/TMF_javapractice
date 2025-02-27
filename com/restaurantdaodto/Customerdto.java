package com.restaurantdaodto;
public class Customerdto {
	private String item;
	private int quantity;
     Customerdto(String item,int quantity){
    	 this.item=item;
    	 this.quantity=quantity;
     }
     public void setitem(String item) {
   	  this.item=item;
     }
     public void setquantity(int quantity) {
   	  this.quantity=quantity;
     }
     public String getitem() {
   	  return item;
     }
     public int getquantity() {
   	  return quantity;
     }
}

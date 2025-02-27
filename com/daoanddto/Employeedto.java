package com.daoanddto;
public class Employeedto {
	  private int id;
	  private String name;
      Employeedto(int id,String name){
    	  this.id=id;
    	  this.name=name;
      }
      public void setid(int id) {
    	  this.id=id;
      }
      public void setname(String name) {
    	  this.name=name;
      }
      public int getid() {
    	  return id;
      }
      public String getname() {
    	  return name;
      }
}

package Collections_practise;
import java.util.*;
public class Array_list_practise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj= new ArrayList<String>();
	       obj.add("welcome");
	       obj.add("tech mahindra");
	       obj.add(1,"for");
	       obj.add("foundation_course");
	       obj.add("bpo");
	       System.out.println(obj);
//	       for(String s:obj ) {
//	    	   System.out.println(s);
//	       }
	       //updating a ArrayList
	       obj.set(1,"to");
	       for(String s:obj ) {
	    	   System.out.println(s);
	       }
	       //searching for element in the list
	       int i=obj.indexOf("bpo");
	       System.out.println("The element is found at index:"+i);
	       //removing elements in the list
	       obj.remove(4);
	       for(String s:obj ) {
	    	   System.out.println(s);
	       }
	       //Accessing elements in the list
	       String str=obj.get(2);
	       System.out.println(str);
	       //checking the elements in the list
	       boolean b=obj.contains("tech mahindra");
	       System.out.println(b);
	}

}

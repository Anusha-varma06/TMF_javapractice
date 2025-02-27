package Exception_handling;
import java.util.Scanner;
public class Exception_exercise extends Exception{  //custom exception
	static int user_id=59673;
    static String password="yuzi@507";
    Exception_exercise(String s){
    	super(s);
    }
	public static void id_check(int u_id) {
	    	   if(u_id==0) {
	    		   throw new ArithmeticException("Enter valid user_id");     
	    	   }
	    	   else {
	    		   System.out.println("valid user_id");
	    	   }
	}
	public static void password_check(String pass) {
 	   if(pass=="") {
 		   throw new NullPointerException("Enter valid password");
 	   }
 	   else {
 		  System.out.println("valid password");
 	   }
	}
 	  public static void validation(int u_id,String pass) throws Exception_exercise {
 	 	   if(!(pass.equals(password))&&u_id!=user_id) {
 	 		   throw new Exception_exercise("No user found");
 	 	   }
 	 	   else {
 	 		 System.out.println("login successful");
 	 	   }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your id:");
       int u_id=sc.nextInt();
       String s=sc.nextLine();
       System.out.println("Enter your password:");
       String pass=sc.nextLine();
       try {
    	   id_check(u_id);
       }
       catch(ArithmeticException e) {
    	   System.out.println(e);
       }
       try {
    	   password_check(pass);
       }
       catch(NullPointerException e) {
    	   System.out.println(e);
       }
       try {
    	   validation(u_id,pass);
       }
       catch(Exception_exercise e) {
    	   System.out.println(e);
       }
       
	}

}

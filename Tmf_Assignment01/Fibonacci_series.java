package Tmf_Assignment01;
import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
	      int b=1;
	      System.out.println("Enter the value to find the fibonacci series till then:");
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int temp;
	      System.out.print(a);
	      System.out.print(" ");
	      System.out.print(b);
	      System.out.print(" ");
	      for(int i=2;i<n;i++) {
	    	  temp=a+b;
	    	  a=b;
	    	  b=temp;
	    	 if(temp<=n) {
	    	  System.out.print(temp);
	       	  System.out.print(" ");
	    	 }
	    	 else {
	    		 break;
	    	 }
	      }
	}

}

package Tmf_Assignment01;
import java.util.Scanner;
public class Switchprogram {
			void calculation() {
				  double num1,num2;
			  	  Scanner sc=new Scanner(System.in);
			  	  System.out.println("Enter 2 numbers:");
			  	  num1=sc.nextDouble();
			  	  num2=sc.nextDouble();
			  	  System.out.println("Select any operator from (+,-,*,/,%)");
			  	  char ch=sc.next().charAt(0);
			  	  double val=0;
			  	  switch (ch) {
			  	  case '+':
			  		  val=num1+num2;
			  		  break; 
			  	  case '-':
			  		  val=num1-num2;
			  		  break;
			  	  case '*':
			  		  val=num1*num2;
			  		  break;
			  	  case '/':
			  		  val=num1/num2;
			  		  break;
			  	  case '%':
			  		  val=num1%num2;
			  		  break;
			  	 default:
			  			  System.out.println("you entered invalid operator");
			  			  
			  	  }
			  	  System.out.println(val);
		}
		      public static void main(String args[]) {
		    	  Switchprogram obj=new Switchprogram();
		    	  obj.calculation();
		    	  
		      }
		}

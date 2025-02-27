package Tmf_Assignment01;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a number to find the factorial");
		  int num=sc.nextInt();
		  int fact=1;
		  while(num!=0) {
			  fact=fact*num;
			  num--;
		  }
		  System.out.println("The factorial of given number:"+fact);
	} 

}

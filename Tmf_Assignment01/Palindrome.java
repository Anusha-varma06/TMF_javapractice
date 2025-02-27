package Tmf_Assignment01;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=252;
		int org=num;
        int temp;
        int rev=0;
        while(num!=0) {
        	temp=num%10;
        	num=num/10;
        	rev=rev*10+temp;
        }
        if(org==rev) {
        	System.out.println("The given number is palindrome");
        }
        else {
        	System.out.println("The given number is not a palindrome");
        }
	}

}

package Tmf_Assignment01;
import java.util.Arrays;
public class Stringspalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Bob";
        String c=s.toLowerCase();
        char ch1[]=c.toCharArray();
        char ch2[]=new char[s.length()];
        int j=0;
        for(int i=ch1.length-1;i>=0;i--) {
        	ch2[j]=ch1[i];
        	j++;
        }
        if(Arrays.equals(ch1,ch2)) {
        	System.out.println("Given string is palindrome");
        }
        else {
        	System.out.println("Given string is not palindrome");
        }
	}

}

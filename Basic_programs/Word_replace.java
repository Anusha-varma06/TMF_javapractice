package Basic_programs;
import java.util.*;
public class Word_replace {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter three words");
	   String s1=sc.next();
	   String s2=sc.next();
	   //String s3=sc.next();
	   String change=s1.toLowerCase();
	   String change1=s1.toLowerCase();
	   
	   StringBuilder result = new StringBuilder();
	   for(int i=0;i<s1.length();i++) {
		   if(change.charAt(i)=='a'||change.charAt(i)=='e'||change.charAt(i)=='i'||change.charAt(i)=='o'||change.charAt(i)=='u') {
			   result.append("*");
		   }
		   else {
			   result.append(change.charAt(i));
		   }
	   }
	   System.out.println(result);
	   }
}

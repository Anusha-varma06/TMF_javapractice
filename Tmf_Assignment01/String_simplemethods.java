package Tmf_Assignment01;
import java.util.*;
public class String_simplemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Hi welcome to India";
        String s[]=s1.split(" ");
        for(String word:s) {
        	System.out.println(word);
        }
        String sub=s1.substring(3,8);
        System.out.println(sub);
        System.out.println(Arrays.toString(s));
        String str="Hello";
        char ch=str.charAt(2);
        System.out.println(ch);
	}

}

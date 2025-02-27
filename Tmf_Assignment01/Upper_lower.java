package Tmf_Assignment01;
import java.util.*;
public class Upper_lower {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="HelLo";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]>='a'&&ch[i]<='z') {
        		ch[i]=Character.toUpperCase(ch[i]);
        	}
        	else {
        		ch[i]=Character.toLowerCase(ch[i]);
        	}
        }
        String s1=Arrays.toString(ch);
        System.out.println(s1);
	}

}

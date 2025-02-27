package Strings;
import java.util.Arrays;
public class Pair_swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="javax";
        char temp;
        char ch[]=str.toCharArray();
        if(ch.length%2==0) {
        	for(int i=0;i<ch.length;i++) {
        		temp=ch[i];
        		ch[i]=ch[i+1];
        		ch[i+1]=temp;
        		i++;
        	}
        	String str1=new String(ch);
        	System.out.println("After pair swapping:"+str1);
        }
        else {
        	for(int j=0;j<ch.length-1;j++) {
        		temp=ch[j];
        		ch[j]=ch[j+1];
        		ch[j+1]=temp;
        		j++;
        	}
        	String str2=new String(ch);
        	//str2=str2+ch[ch.length-1];
        	System.out.println("After pair swapping:"+str2);
        	
        }
	}

}

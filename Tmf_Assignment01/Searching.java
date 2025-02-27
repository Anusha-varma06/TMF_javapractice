package Tmf_Assignment01;
import java.util.*;
public class Searching {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int arr[]= {5,10,15,20,25};
        System.out.println("Enter an element to search in an array");
        int s=sc.nextInt();
        int i=0;
        for(int ele:arr) {
        	if(ele==s) {
        		System.out.println("The element is found at index"+" "+i);
        	}
        	i++;
        }
        
	}

}

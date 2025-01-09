package Arrays;
import java.util.*;
public class Search_element {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number to search:");
         int num=sc.nextInt();
         int arr[]= {3,6,9,12,15,18,21,14};
         int nope=0;
         for(int i=0;i<arr.length;i++) {
        	 if(num==arr[i]) {
        		 System.out.println("Element is present at the index:"+i);
        		 break;
        	 }
        	 else {
        		 nope++;
        	 }
         }
         if(nope==arr.length) {
        	 System.out.println("Given element is not present in an array");
         }
	}

}

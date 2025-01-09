package Arrays;
import java.util.*;
public class Pair_element_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check the pairs:");
        int no=sc.nextInt();
        int arr[]= {2,5,6,7,3};
        for(int i=0;i<arr.length;i++){
        	if(i!=0) {
        		for(int j=0;j<arr.length;j++) {
            		if(i!=j) {
            			if(arr[i]+arr[j]==no) {
            				System.out.println("("+arr[i]+","+arr[j]+")");
            				arr[j]=0;
            			}
            		}
            	}	
        	}
        }
	}

}

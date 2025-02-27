package Tmf_Assignment01;
import java.util.*;
public class Removeoccurences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the element to remove all the occurences");
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        int arr[]= {3,7,2,5,3,6,8};
        int count=0;
        int k=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==ele) {
        		count++;
        		arr[i]=-1;
        	}
        }
        int rem[]=new int[arr.length-count];
        for(int j=0;j<arr.length;j++) {
        	if(arr[j]!=-1) {
        		rem[k]=arr[j];
        		k++;
        	}
        }
        System.out.println("After removal:"+Arrays.toString(rem));
	}

}

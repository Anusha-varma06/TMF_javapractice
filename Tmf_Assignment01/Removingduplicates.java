package Tmf_Assignment01;
import java.util.*;
public class Removingduplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={2,4,2,6,2,6,7};
        Arrays.sort(arr);
        int count=0;
        int k=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=-1) {
        		for(int j=i+1;j<arr.length;j++) {
            		if(arr[i]==arr[j]) {
            			arr[j]=-1;
            		}
            	}
        	}
        }
        for(int s:arr) {
        	if(arr[k]!=-1) {
        		System.out.println(arr[k]);
        	}
        	k++;
        }
	}

}

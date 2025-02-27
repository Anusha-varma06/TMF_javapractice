package Tmf_Assignment01;
import java.util.Arrays;
public class Mergearrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[]= {1,2,3,4,5};
        int arr2[]= {6,7,8,9,10,11,12};
       int l1=arr1.length;
       int l2=arr2.length;
       int len=l1+l2;
       int k=0;
       int mer[]=new int[len];
       for(int i=0;i<l1;i++) {
    	   mer[i]=arr1[i];
       }
       for(int j=l1;j<len;j++) {
    	   mer[j]=arr2[k];
    	   k++;
       }
        System.out.println(Arrays.toString(mer));
	}

}

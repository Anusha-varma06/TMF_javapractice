package Tmf_Assignment01;
import java.util.Arrays;
public class Arraycomparison {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr1[]= {3,9,2,6,4,8};
         int arr2[]= {3,9,2,6,4,8};
         boolean b=Arrays.equals(arr1,arr2);
         if(b) {
        	 System.out.println("Both the arrays are equal");
         }
         else {
        	 System.out.println("Arrays are not equal");
         }
         
	}

}

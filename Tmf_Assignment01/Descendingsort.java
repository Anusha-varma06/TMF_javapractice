package Tmf_Assignment01;
import java.util.Arrays;
public class Descendingsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,8,6,2};
        Arrays.sort(arr);
        System.out.println("sorting elements of an array in descending order:");
        for(int i=arr.length-1;i>=0;i--) {
        	System.out.print(arr[i]+" ");
        }
	}

}

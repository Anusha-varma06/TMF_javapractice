package Tmf_Assignment01;
import java.util.Arrays;
public class Copyelements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {3,5,7,9,1};
         int b[]=new int[a.length];
         for(int i=0;i<b.length;i++) {
        	 b[i]=a[i];
         }
         System.out.println("The copied array is:"+Arrays.toString(b));
	}

}

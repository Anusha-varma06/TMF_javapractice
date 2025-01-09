package Arrays;
import java.util.*;
public class Marks_flag {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      int flag=0;
      int sum=0;;
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextInt();
    	  if(arr[i]<=35) {
    		  flag++;
    	  }
    	  else {
    		  sum=sum+arr[i];
    	  }
      }
      if(flag>3) {
    	  System.out.println("failed");
      }
      else {
    	  System.out.println("The total marks he scored:"+sum);
      }
	}

}

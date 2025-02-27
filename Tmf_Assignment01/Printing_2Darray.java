package Tmf_Assignment01;
import java.util.*;
public class Printing_2Darray {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		        int arr[][]=new int[3][3];
		        Scanner sc=new Scanner(System.in);  
		        System.out.println("Enter the values into the 2d array");
		        for(int i=0;i<3;i++) {
		        	for(int j=0;j<3;j++) {
		        		arr[i][j]=sc.nextInt();
		        	}
		        }
		        System.out.println("The elements in the matrix is:");
		        for(int i=0;i<3;i++) {
		        	for(int j=0;j<3;j++) {
		        		System.out.print(arr[i][j]+" ");
		        	}
		        	System.out.println();
		        }
		        
			}

		
	}

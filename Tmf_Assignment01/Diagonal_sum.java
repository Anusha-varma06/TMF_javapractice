package Tmf_Assignment01;
import java.util.Scanner;
public class Diagonal_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[][]=new int[3][3];
				int sum=0;
		        Scanner sc=new Scanner(System.in);  
		        System.out.println("Enter the values into the 2d array");
		        for(int i=0;i<3;i++) {
		        	for(int j=0;j<3;j++) {
		        		arr[i][j]=sc.nextInt();
		        		if(i==j) {
		        			sum=sum+arr[i][j];
		        		}
		        	}
		        }
		        System.out.println("The sum of the diagonal elements is:"+sum);
			}

		}
	

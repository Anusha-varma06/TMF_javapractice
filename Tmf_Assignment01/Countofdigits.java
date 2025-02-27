package Tmf_Assignment01;

public class Countofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int num=2528;
		        int temp;
		        int count=0;
		        while(num!=0) {
		        	temp=num%10;
		        	num=num/10;
		        	count++;
		        }
		        System.out.println("The number of digits:"+count);
		        
			}

		}



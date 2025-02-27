package Tmf_Assignment01;
public class Sumofdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=258;
        int temp;
        int sum=0;
        while(num!=0) {
        	temp=num%10;
        	num=num/10;
        	sum=sum+temp;
        }
        System.out.println("sum of the digits:"+sum);
	}

}

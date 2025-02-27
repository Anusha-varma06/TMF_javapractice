package Tmf_Assignment01;
public class Reverse_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=256;
        int temp;
        int rev=0;
        while(num!=0) {
        	temp=num%10;
        	num=num/10;
        	rev=rev*10+temp;
        }
        System.out.println("The reverse of a number:"+rev);
	}

}

package Tmf_Assignment01;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        int arm=num;
        double sum=0;
        double power;
        int val;
        while(num!=0) {
       	 num=num/10;
       	 count++;
        }
        while(temp!=0) {
       	 val=temp%10;
       	 power=Math.pow(val,count);
       	 sum=sum+power;
       	 temp=temp/10;
        }
        if(sum==arm) {
       	 System.out.println("Armstrong number");
        }
        else {
       	 System.out.println("Not an armstrong number");
        }
	}

}

package Tmf_Assignment01;
public class Max_min_ofdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=284;
        int num1=num;
        int max=num%10;
        int min=num%10;
        int temp;
        int temp1;
        while(num!=0) {
        	temp=num%10;
        	num=num/10;
            if(temp>max) {
            	max=temp;
            }
	    }
        System.out.println("The maximun digit is:"+max);
        while(num1!=0) {
        	temp1=num1%10;
        	num1=num1/10;
            if(temp1<min) {
            	min=temp1;
            }
	    }
        System.out.println("The minimun digit is:"+min);

}
}

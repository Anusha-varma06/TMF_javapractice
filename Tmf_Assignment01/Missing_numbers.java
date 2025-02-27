package Tmf_Assignment01;
public class Missing_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,4,6,2,7,5};
        int n=7;
        int sum=n*(n+1)/2;
        int sum_array=0;
        for(int i=0;i<a.length;i++) {
        	sum_array=sum_array+a[i];
        }
        int missing=sum-sum_array;
        System.out.println("The missing number in the given length is:"+missing);
	}

}

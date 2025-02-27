package Tmf_Assignment01;
public class Largestelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {17,5,23,62,42,9};
        int max=arr[0];
        int i=0;
        for(int s:arr) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        	i++;
        }
        System.out.println("The largest element is"+" "+max);
	}

}

package Tmf_Assignment01;
public class Commonelements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {7,3,8,2,9};
         int b[]= {8,4,2,1,7,6,5,3};
         System.out.println("The common elements of both the arrays are:");
         for(int i=0;i<a.length;i++) {
        	 for(int j=0;j<b.length;j++) {
        		 if(a[i]==b[j]) {
        			 System.out.print(a[i]+" ");
        		 }
        	 }
         }
	}

}

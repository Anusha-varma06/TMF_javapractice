package Tmf_Assignment01;
public class Sorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,8,6,2};
        int temp;
        int pass=a.length;
        for(int i=1;i<a.length;i++) {
        	for(int j=1;j<pass;j++) {
        		if(a[j-1]>a[j]) {
        			temp=a[j-1];
        			a[j-1]=a[j];
        			a[j]=temp;
        		}
        	}
        	pass--;
        }
        System.out.println("The sorted array is:");	
        for(int x:a) {
        	System.out.print(x+" ");	
        }
	}

}
